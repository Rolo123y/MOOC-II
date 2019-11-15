package week7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

	private HashMap<String, String> words;

	public Dictionary() {
		this.words = new HashMap<String, String>();
	}

	public String translate(String word) {
		if (this.words.containsKey(word)) {
			return words.get(word);
		}
		return null;
	}

	public void add(String word, String translation) {
		this.words.put(word, translation);
	}

	public int amountOfWords() {
		return this.words.size();
	}

	public ArrayList<String> translationList() {
		ArrayList<String> translationlist = new ArrayList<>();
		for (String n : words.keySet()) {
			translationlist.add(n + " = " + words.get(n));
		}
		return translationlist;
	}

}
