package week10.TheFinnishRingingCentre;

public class Bird {

	private String name;
	private String latinName;
	private int ringingYear;

	public Bird(String name, String latinName, int ringingYear) {
		this.name = name;
		this.latinName = latinName;
		this.ringingYear = ringingYear;
	}

	@Override
	public String toString() {
		return this.latinName + "(" + this.ringingYear + ")";
	}

	@Override
	public boolean equals(Object object) {
		if (object == null || (this.getClass() != object.getClass())) {
			return false;
		}
		Bird other = (Bird) object;
		if (!this.latinName.equals(other.latinName) || (this.ringingYear != other.ringingYear)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return 31 * this.latinName.hashCode() + this.ringingYear;
	}
}
