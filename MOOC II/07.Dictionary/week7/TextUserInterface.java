package week7;

import java.util.Scanner;

public class TextUserInterface {

	private Scanner reader;
	private Dictionary dictionary;

	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dictionary = dictionary;
	}

	public String StringReader(Scanner reader) {
		return reader.nextLine().toLowerCase().trim();
	}

	public void add() {
		System.out.print("In Finnish: ");
		String Finnish = StringReader(reader);
		System.out.print("Translation: ");
		String translation = StringReader(reader);
		dictionary.add(Finnish, translation);
	}

	public void translate() {
		System.out.print("Give a word: ");
		String word = StringReader(reader);
		System.out.println("Translation: " + dictionary.translate(word));
	}

	public void start() {
		System.out.println("Statement: \n  add - adds a word pair to the dictionary\r\n"
				+ "  translate - asks a word and prints its translation\r\n"
				+ "  quit - quits the text user interface");
		while (true) {
			System.out.print("\nStatement: ");
			String Statement = StringReader(reader);
			StatementHandler(Statement);
		}
	}

	public void StatementHandler(String statement) {
		if (statement.equals("quit")) {
			System.out.println("Cheers!");
			System.exit(0);
		} else if (statement.equals("add")) {
			add();
		} else if (statement.equals("translate")) {
			translate();
		} else {
			System.out.println("unkown statement");
		}
	}

}
