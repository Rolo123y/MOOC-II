package week8;

import java.util.ArrayList;

public class Box implements toBeStored {
	private ArrayList<toBeStored> list;
	private double maxWeight;

	public Box(double maxWeight) {
		this.maxWeight = maxWeight;
		this.list = new ArrayList<>();
	}

	public void add(toBeStored toBeStored) {
		if (weight() > this.maxWeight) {
			return;
		}
		this.list.add(toBeStored);
	}

	public double weight() {
		double weight = 0;
		for (toBeStored n : this.list) {
			weight += n.weight();
		}
		return weight;
	}

	public String toString() {
		return "Box: " + this.list.size() + " things, total weight " + this.weight() + " kg";
	}
}
