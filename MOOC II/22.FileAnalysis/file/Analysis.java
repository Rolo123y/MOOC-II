package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

	private File file;
	private Scanner reader;

	public Analysis(File file) {
		this.file = file;

	}

	public int lines() throws FileNotFoundException {
		reader = new Scanner(file);
		int lines = 0;
		while (reader.hasNextLine()) {
			lines++;
			reader.nextLine();
		}
		return lines;
	}

	public int characters() throws FileNotFoundException {
		reader = new Scanner(file);
		int numOfCharacters = 0;

		while (reader.hasNextLine()) {
			String n = reader.nextLine();
			numOfCharacters += n.length() + 1;
		}
		return numOfCharacters;
	}
}
