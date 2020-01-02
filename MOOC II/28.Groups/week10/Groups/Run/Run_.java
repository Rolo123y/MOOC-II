package week10.Groups.Run;

import week10.Groups.movable.*;

public class Run_ {

	public static void main(String[] args) {
		Group group = new Group();
		group.addToGroup(new Organism(73, 56));
		group.addToGroup(new Organism(57, 66));
		group.addToGroup(new Organism(46, 52));
		group.addToGroup(new Organism(19, 107));
		System.out.println(group);
		int dx = 10;
		int dy = 10;
		group.move(dx, dy);
		System.out.println("After movemvent of: x:" + dx + "; y: " + dy);
		System.out.println(group);
	}

}
