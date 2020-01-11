package week10.DifferentBoxes.boxes;

import java.util.Collection;
import java.util.LinkedList;

public class OneThingBox extends Box {

	private Collection<Thing> oneThing;

	public OneThingBox() {
		this.oneThing = new LinkedList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		if (this.oneThing.isEmpty()) {
			this.oneThing.add(thing);
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return this.oneThing.contains(thing);
	}

}
