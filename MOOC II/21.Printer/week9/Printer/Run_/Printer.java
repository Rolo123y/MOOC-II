package week9.Printer.Run_;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

	private File file;
	private Scanner reader;

	public Printer(String fileName) throws Exception {
		this.file = new File(fileName);
	}

	public String getFilePath() {
		return file.getAbsolutePath();
	}

	public void printLinesWhichContain(String word) throws FileNotFoundException {
		reader = new Scanner(file);
		if (word.equals("")) {
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		} else {
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				if (line.contains(word)) {
					System.out.println(line);
				}
			}
		}
	}
}
