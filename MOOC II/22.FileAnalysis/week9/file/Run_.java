package week9.file;

import java.io.File;
import java.io.FileNotFoundException;

public class Run_ {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("22.FileAnalysis\\textfile.txt");
		Analysis analysis = new Analysis(file);
		System.out.println("Lines: " + analysis.lines());
		System.out.println("Characters: " + analysis.characters());
	}

}
