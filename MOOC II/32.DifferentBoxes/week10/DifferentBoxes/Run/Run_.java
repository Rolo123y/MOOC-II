package week10.DifferentBoxes.Run;

import week10.DifferentBoxes.boxes.*;

public class Run_ {

	public static void main(String[] args) {
		BlackHoleBox box = new BlackHoleBox();
		box.add(new Thing("Saludo", 5));
		box.add(new Thing("Pirkka", 5));

		System.out.println(box.isInTheBox(new Thing("Saludo")));
		System.out.println(box.isInTheBox(new Thing("Pirkka")));
	}

}
