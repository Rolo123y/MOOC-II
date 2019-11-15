package week7;

import java.util.ArrayList;

public class Container {

	private int MaximumWeightLimit;
	private ArrayList<Suitcase> Suitcases;

	public Container(int maximumweight) {
		this.MaximumWeightLimit = maximumweight;
		this.Suitcases = new ArrayList<>();
	}

	public void addSuitcase(Suitcase suitcase) {
		if (totalWeight() + suitcase.totalWeight() < this.MaximumWeightLimit) {
			Suitcases.add(suitcase);
		}
	}

	public int totalWeight() {
		int TotalWeight = 0;
		for (Suitcase n : Suitcases) {
			TotalWeight += n.totalWeight();
		}
		return TotalWeight;
	}

	public void printThings() {
		for (Suitcase n : Suitcases) {
			n.printThings();
		}
	}

	public String toString() {
		return Suitcases.size() + " suitcases (" + totalWeight() + " kg)";
	}
}
