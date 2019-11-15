package week7;

import java.util.ArrayList;

public class Suitcase {

	private int MaximumWeightLimit;
	private ArrayList<Thing> things;

	public Suitcase(int maximumweightlimit) {
		this.things = new ArrayList<>();
		this.MaximumWeightLimit = maximumweightlimit;
	}

	public void addThing(Thing thing) {
		if (totalWeight() + thing.getWeight() < MaximumWeightLimit) {
			things.add(thing);
		}
	}

	public void printThings() {
		for (Thing n : things) {
			System.out.println(n);
		}
	}

	public int totalWeight() {
		int TotalWeight = 0;
		for (Thing n : things) {
			TotalWeight += n.getWeight();
		}
		return TotalWeight;
	}

	public Thing heaviestThing() {
		int index = 0;
		for (int i = 0; i < things.size() - 1; i++) {
			if (things.get(i).getWeight() < things.get(i + 1).getWeight()) {
				index = i + 1;
			}
		}
		return things.get(index);
	}

	public String toString() {
		if (things.size() == 0) {
			return "empty (0 kg)";
		} else if (things.size() == 1) {
			return things.size() + " thing (" + totalWeight() + " kg)";
		} else {
			return things.size() + " things (" + totalWeight() + " kg)";
		}
	}
}
