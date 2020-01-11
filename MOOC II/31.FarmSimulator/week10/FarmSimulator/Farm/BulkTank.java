package week10.FarmSimulator.Farm;

public class BulkTank {

	private double capacity;
	private double volume;

	public BulkTank() {
		this.capacity = 2000.0;
		this.volume = 0.0;
	}

	public BulkTank(double capacity) {
		this.capacity = capacity;
		this.volume = 0.0;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getVolume() {
		return this.volume;
	}

	public double howMuchFreeSpace() {
		return this.capacity - this.volume;
	}

	public void addToTank(double amount) {
		if (amount > howMuchFreeSpace()) {
			this.volume = this.capacity;
		} else {
			this.volume += amount;
		}
	}

	public double getFromTank(double amount) {
		if (amount > getVolume()) {
			return this.volume = 0.0;
		} else {
			return this.volume -= amount;
		}
	}

	@Override
	public String toString() {
		return Math.round((getVolume()) * 100) / 100.0 + "/" + getCapacity();
	}
}
