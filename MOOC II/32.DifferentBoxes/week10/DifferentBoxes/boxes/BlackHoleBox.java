package week10.DifferentBoxes.boxes;

import java.util.Collection;
import java.util.LinkedList;

public class BlackHoleBox extends Box {

	private Collection<Thing> oneThing;

	public BlackHoleBox() {
		this.oneThing = new LinkedList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		this.oneThing.add(thing);
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return false;
	}

}
