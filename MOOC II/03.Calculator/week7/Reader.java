package week7;

import java.util.Scanner;

public class Reader {

	Scanner reader;

	public Reader() {
		this.reader = new Scanner(System.in);
	}

	public String readString() {
		return reader.nextLine();
	}

	public int readInteger() {
		return Integer.parseInt(reader.nextLine());
	}

}
