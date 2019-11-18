package week8;

public class Book implements toBeStored {

	private String Writer;
	private String Name;
	private double Weight;

	public Book(String writer, String name, double weight) {
		this.Writer = writer;
		this.Name = name;
		this.Weight = weight;
	}

	public double weight() {
		return this.Weight;
	}

	public String toString() {
		return this.Writer + ": " + this.Name;
	}

}
