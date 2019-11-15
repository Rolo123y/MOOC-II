package week7;

public class main01 {

	public static void main(String[] args) {
		printWithSmileys("Meth");
		System.out.println();
		printWithSmileys("Bee");
		System.out.println();
		printWithSmileys("Inter");
		System.out.println();
		printWithSmileys("\\:D/");
		System.out.println();
		printWithSmileys("87.");
	}

	public static void printSmileys(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(":)");
		}
		System.out.println();
	}

	public static void printWithSmileys(String characterString) {
		if (characterString.length() % 2 == 0) {
			printSmileys(characterString.length() + 1);
			System.out.println(":) " + characterString + " :)");
			printSmileys(characterString.length() + 1);
		} else {
			printSmileys(characterString.length() + 2);
			System.out.println(":) " + characterString + "  :)");
			printSmileys(characterString.length() + 2);
		}
	}

}
