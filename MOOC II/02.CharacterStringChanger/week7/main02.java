package week7;

public class main02 {

	public static void main(String[] args) {
		Changer scandiesAway = new Changer();
		scandiesAway.addChange(new Change('ä', 'a'));
		scandiesAway.addChange(new Change('ö', 'o'));
		System.out.println("Before: ääliö älä lyö, ööliä läikkyy");
		System.out.println("After: " + scandiesAway.Change("ääliö älä lyö, ööliä läikkyy"));
	}

}
