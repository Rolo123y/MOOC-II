package week9.moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

	private int maximumCapacity;
	private List<Thing> things;

	public Box(int maximumCapacity) {
		this.setMaximumCapacity(maximumCapacity);
		this.things = new ArrayList<Thing>();
	}

	public int getMaximumCapacity() {
		return maximumCapacity;
	}

	public void setMaximumCapacity(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	public boolean addThing(Thing thing) {
		if ((getVolume() + thing.getVolume()) <= maximumCapacity) {
			things.add(thing);
			return true;
		}
		return false;
	}

	@Override
	public int getVolume() {
		int total = 0;
		for (Thing n : this.things) {
			total += n.getVolume();
		}
		return total;
	}

	@Override
	public String toString() {
		return "things in the box: " + getVolume() + " dm^3";
	}

}
