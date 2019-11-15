package week7;

import java.util.Scanner;

public class main07 {

	public static void main(String[] args) {

		String input = "add\n" + "cheese\n" + "juusto\n" + 
					   "add\n" + "bier\n" + "olut\n" + 
					   "add\n" + "book\n"+ "kirja\n" + 
					   "add\n" + "computer\n" + "tietokone\n" + 
					   "add\n" + "auto\n" + "car\n" +
					   "translate\n" + "cheese\n"+
					   "quit\n";
		Dictionary dict = new Dictionary();
		Scanner reader = new Scanner(input);
		
		//Scanner reader = new Scanner(System.in);

		TextUserInterface ui = new TextUserInterface(reader, dict);
		ui.start();

	}

}
