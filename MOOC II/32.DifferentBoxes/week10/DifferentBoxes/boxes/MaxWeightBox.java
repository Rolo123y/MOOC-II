package week10.DifferentBoxes.boxes;

import java.util.Collection;
import java.util.LinkedList;

public class MaxWeightBox extends Box {

	private int maxWeight;
	private Collection<Thing> things;

	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
		this.things = new LinkedList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		int temp = thing.getWeight() + totalWeight(things);
		if (temp <= this.maxWeight) {
			this.things.add(thing);
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return this.things.contains(thing);
	}

}
