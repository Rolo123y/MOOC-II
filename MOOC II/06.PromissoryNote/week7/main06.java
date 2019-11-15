package week7;

public class main06 {

	public static void main(String[] args) {
		PromissoryNote mattisNote = new PromissoryNote();

		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Mikael", 30);

		System.out.println(mattisNote.howMuchIsTheDept("Arto"));
		System.out.println(mattisNote.howMuchIsTheDept("Joel"));

	}
}
