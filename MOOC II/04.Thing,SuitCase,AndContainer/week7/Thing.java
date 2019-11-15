package week7;

public class Thing {

	private String name;
	private int Weight;

	public Thing(String name, int weight) {
		this.name = name;
		this.Weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.Weight;
	}

	public String toString() {
		return this.name + " (" + this.Weight + " kg)";
	}
}
