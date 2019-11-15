package week7;

public class Plane {

	private String ID;
	private int Capacity;

	public Plane(String ID, int Capacity) {
		this.Capacity = Capacity;
		this.ID = ID;
	}

	public String getID() {
		return this.ID;
	}

	public int getCapacity() {
		return this.Capacity;
	}

	public String toString() {
		return this.ID.toUpperCase().trim() + " (" + this.Capacity + " ppl)";
	}

}
