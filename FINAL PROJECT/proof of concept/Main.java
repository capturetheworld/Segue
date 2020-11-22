public class Main {

	public static void main(String[] args) {
		Synthesizer.setSlotDuration(100);
		for (int i = 0; i < 5; i++) {
			Synthesizer.playMidi(60, 1);
			Synthesizer.playMidi(65, 1);
			Synthesizer.playMidi(69, 1);
			Synthesizer.playMidi(72, 1);
		}
		Synthesizer.begin();

	}

}
