package week10.DifferentBoxes.boxes;

public class Thing {

	private String name;
	private int weight;

	public Thing(String name, int weight) {
		this.name = name;
		if (weight < 0) {
			throw new IllegalArgumentException("weight cannot be negative");
		}
		this.weight = weight;
	}

	public Thing(String name) {
		this(name, 0);
	}

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		}
		if (object instanceof Thing) {
			Thing thing = (Thing) object;
			if (this.name.equals(thing.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 13;
		return 31 * hash * this.name.hashCode() + (this.name != null ? this.name.hashCode() : 0);
	}

}
