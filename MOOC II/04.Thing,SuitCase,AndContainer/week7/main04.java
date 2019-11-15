package week7;

public class main04 {

	public static void main(String[] args) {
		// Thing book = new Thing("Happiness in Three Steps", 2);
		// Thing mobile = new Thing("Nokia 3210", 1);
		// Thing brick = new Thing("Brick", 4);
		//
		// Suitcase tomsCase = new Suitcase(10);
		// tomsCase.addThing(book);
		// tomsCase.addThing(mobile);
		//
		// Suitcase georgesCase = new Suitcase(10);
		// georgesCase.addThing(brick);
		//
		// Container container = new Container(1000);
		// container.addSuitcase(tomsCase);
		// container.addSuitcase(georgesCase);
		//
		// System.out.println("There are the following things in the container
		// suitcases:");
		// container.printThings();

		Container container = new Container(1000);
		addSuitcasesFullOfBricks(container);
		System.out.println(container);
	}

	public static void addSuitcasesFullOfBricks(Container container) {
		for (int i = 0; i < 100; i++) {
			Thing brick = new Thing("Brick", i + 1);
			Suitcase suitcase = new Suitcase(101);
			suitcase.addThing(brick);
			container.addSuitcase(suitcase);
		}
	}
}
