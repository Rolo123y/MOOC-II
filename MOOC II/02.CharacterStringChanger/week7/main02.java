package week7;

public class main02 {

	public static void main(String[] args) {
		Changer scandiesAway = new Changer();
		scandiesAway.addChange(new Change('�', 'a'));
		scandiesAway.addChange(new Change('�', 'o'));
		System.out.println("Before: ��li� �l� ly�, ��li� l�ikkyy");
		System.out.println("After: " + scandiesAway.Change("��li� �l� ly�, ��li� l�ikkyy"));
	}

}
