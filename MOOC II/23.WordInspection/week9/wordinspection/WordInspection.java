package week9.wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

	private final String VOWELS = "aeiouyäö";

	private Scanner reader;
	private File file;
	List<String> StoredFile;

	public WordInspection(File file) throws FileNotFoundException {
		this.file = file;
		this.StoredFile = new ArrayList<String>();
		this.StoredFile = readFile();
	}

	public List<String> readFile() throws FileNotFoundException {
		reader = new Scanner(file);
		List<String> temp = new ArrayList<String>();

		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			temp.add(line);
		}
		return temp;
	}

	public int wordCount() throws FileNotFoundException {
		int count = 0;
		for (String n : StoredFile) {
			count++;
		}
		return count;
	}

	public List<String> wordsContainingZ() throws FileNotFoundException {
		List<String> wordsContainsZ = new ArrayList<String>();

		for (String n : StoredFile) {
			if (n.contains("z")) {
				wordsContainsZ.add(n);
			}
		}
		return wordsContainsZ;
	}

	public List<String> wordsEndingInL() {
		List<String> wordsEndingL = new ArrayList<String>();

		for (String n : StoredFile) {
			if (n.charAt(n.length() - 1) == 'l') {
				wordsEndingL.add(n);
			}
		}
		return wordsEndingL;
	}

	public List<String> palindromes() {
		List<String> listOfPalindromes = new ArrayList<String>();

		for (String n : StoredFile) {
			if (isPalindrome(n) == true) {
				listOfPalindromes.add(n);
			}
		}
		return listOfPalindromes;
	}

	public boolean isPalindrome(String n) {
		if (n.length() <= 1) {
			return true;
		}
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) != n.charAt(n.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public List<String> wordsWhichContainAllVowels() {
		List<String> wordWithAllVowels = new ArrayList<String>();

		for (String n : StoredFile) {
			boolean allVowelsPresent = true;
			for (char a : VOWELS.toCharArray()) {
				if (!(n.contains("" + a))) {
					allVowelsPresent = false;
				}
			}
			if (allVowelsPresent == true) {
				wordWithAllVowels.add(n);
			}
		}
		return wordWithAllVowels;
	}

}
