package week9.wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Run_ {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("23.WordInspection\\wordinspection\\wordList.txt");
		WordInspection n = new WordInspection(file);

		System.out.println(n.wordCount());
		System.out.println(n.wordsContainingZ());
		System.out.println(n.wordsEndingInL());
		System.out.println(n.palindromes());
		System.out.println(n.wordsWhichContainAllVowels());

	}

}
