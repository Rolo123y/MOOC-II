package week10.DifferentBoxes.boxes;

import java.util.Collection;

public abstract class Box {

	public abstract void add(Thing thing);

	public void add(Collection<Thing> things) {
		for (Thing thing : things) {
			add(thing);
		}
	}

	public int totalWeight(Collection<Thing> things) {
		int total = 0;
		for (Thing n : things) {
			total += n.getWeight();
		}
		return total;
	}

	public abstract boolean isInTheBox(Thing thing);
}
