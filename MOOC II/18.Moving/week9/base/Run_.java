package week9.base;

import java.util.ArrayList;
import java.util.List;

import week9.moving.domain.Box;
import week9.moving.domain.Item;
import week9.moving.domain.Thing;
import week9.moving.logic.Packer;

public class Run_ {

	public static void main(String[] args) {
		List<Thing> things = new ArrayList<Thing>();
		things.add(new Item("passport", 2));
		things.add(new Item("toothbrash", 1));
		things.add(new Item("book", 4));
		things.add(new Item("circular saw", 8));

		// we create a packer which uses boxes whose volume is 10
		Packer packer = new Packer(10);

		// we ask our packer to pack things into boxes
		List<Box> boxes = packer.packThings(things);

		System.out.println("number of boxes: " + boxes.size());

		for (Box box : boxes) {
			System.out.println(box);
		}

	}

}
