package week9.MultipleEntryDictionary.Dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

	private Map<String, Set<String>> Dictionary;

	public PersonalMultipleEntryDictionary() {
		this.Dictionary = new HashMap<String, Set<String>>();
	}

	public void add(String word, String entry) {
		if (!Dictionary.containsKey(word)) {
			Dictionary.put(word, new HashSet<String>());
		}

		Set<String> translation = Dictionary.get(word);
		translation.add(entry);
	}

	public Set<String> translate(String word) throws Exception {
		if (this.Dictionary.containsKey(word)) {
			return this.Dictionary.get(word);
		} else {
			return null;
		}
	}

	public void remove(String word) throws Exception {
		if (this.Dictionary.containsKey(word)) {
			this.Dictionary.remove(word);
		} else {
			throw new Exception("Word never Existed in this Dictionary!");
		}
	}

}
