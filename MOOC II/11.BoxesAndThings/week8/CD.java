package week8;

public class CD implements toBeStored {

	private String artist;
	private String titile;
	private int publishingYear;
	private final double weight = 0.1;

	public CD(String artist, String title, int Year) {
		this.artist = artist;
		this.titile = title;
		this.publishingYear = Year;
	}

	public double weight() {
		return this.weight;
	}

	public String toString() {
		return this.artist + ": " + this.titile + " (" + this.publishingYear + ")";
	}
}
