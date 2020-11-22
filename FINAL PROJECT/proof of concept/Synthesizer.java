import java.util.concurrent.LinkedBlockingQueue;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Synthesizer extends Thread {
	public static final int SAMPLE_RATE = 44100;
	public static final int CHECK_BUFFER_EVERY_N_SAMPLES = 1000;
	
	private static AudioFormat af;
	private static SourceDataLine line;
	private static Synthesizer synth;
	
	private static double slotDuration;
	private static int lineBufferSize;
	private static long processedFrameNum = 0;
	private static long addedFrameNum = 0;
	
	private static boolean keepToppingOffBuffer = true;
	private static LinkedBlockingQueue<Note> notes = new LinkedBlockingQueue<>();
	
	public static void setSlotDuration (double ms) {
		slotDuration = ms;
	}
	
	public static void playMidi (double note, int duration) {
		long d = (long) ((duration * slotDuration / 1000) * SAMPLE_RATE);
		notes.add(new Note(getFreqFromMIDINote(note), addedFrameNum, d));
		addedFrameNum += d;
	}
	
	public static void begin () {
		af = new AudioFormat(SAMPLE_RATE, 8, 1, true, true);
		try {
			line = AudioSystem.getSourceDataLine(af);
			line.open(af, SAMPLE_RATE);
			
			lineBufferSize = line.getBufferSize();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (line == null) {
			System.out.println("Error: unable to open audio output device; Line unavailable.");
			System.exit(1);
		}
		line.start();
		
		synth = new Synthesizer();
		synth.start();
		
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
		    @Override
		    public void run()
		    {
		        if (line != null) {
		        	line.close();
		        }
		    }
		});
	}
	
	public static void end () {
		keepToppingOffBuffer = false;
		try {
			synth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private double getNoteValue (long index) {
		Note currentNote = notes.peek();
		if (currentNote == null) return 0;
		
		while (index > currentNote.getIndex() + currentNote.getDuration()) {
			notes.remove();
			currentNote = notes.peek();
			if (currentNote == null) return 0;
		}
		
		int offset = (int) (index - currentNote.getIndex());
		double factor = 2 * Math.PI / ((double)SAMPLE_RATE / currentNote.getFrequency());
		double value = Math.sin(factor * offset);
		return value;
	}
	
	public void run () {
		while (keepToppingOffBuffer) {
			int availableBytes = line.available();
			byte[] samples = new byte[availableBytes];
			for (long i = processedFrameNum; i < processedFrameNum + availableBytes; i++) {
				double sample = getNoteValue(i);
				sample = Math.max(sample, -1.0);
				sample = Math.min(sample, 1.0);
				samples[(int) (i - processedFrameNum)] = (byte)(127.0 * sample);
			}
			
			line.write(samples, 0, availableBytes);
			processedFrameNum = processedFrameNum + availableBytes;
			
			try {
				sleep((long) (1000 * (double)CHECK_BUFFER_EVERY_N_SAMPLES / SAMPLE_RATE));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static double getFreqFromMIDINote (double note) {
		return 27.5 * Math.pow(2, (note - 21) / 12);
	}
}
