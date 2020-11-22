public class Note {
	private double frequency;
	private long index;
	private long duration;
	
	public Note(double frequency, long index, long duration) {
		this.frequency = frequency;
		this.index = index;
		this.duration = duration;
	}
	
	public double getFrequency() {
		return frequency;
	}
	public long getIndex() {
		return index;
	}
	public long getDuration() {
		return duration;
	}
}
