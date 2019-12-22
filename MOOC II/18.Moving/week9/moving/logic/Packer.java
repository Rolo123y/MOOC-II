package week9.moving.logic;

import java.util.ArrayList;
import java.util.List;

import week9.moving.domain.Box;
import week9.moving.domain.Thing;

public class Packer {

	private int boxesVolume;
	private List<Box> boxes;

	public Packer(int boxesVolume) {
		this.boxes = new ArrayList<Box>();
		this.boxesVolume = boxesVolume;
	}

	public List<Box> packThings(List<Thing> things) {
		Box box = new Box(this.boxesVolume);
		if (!things.isEmpty()) {
			this.boxes.add(box);
			for (Thing n : things) {
				if (box.addThing(n) == false) {
					box = new Box(boxesVolume);
					box.addThing(n);
					this.boxes.add(box);
				}
			}
		}
		return boxes;
	}
}
