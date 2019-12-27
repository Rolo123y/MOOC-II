package week9.DuplicateRemover.tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

	private List<String> words;
	private Set<String> removedDuplicates;

	public PersonalDuplicateRemover() {
		this.words = new ArrayList<String>();
		this.removedDuplicates = new HashSet<String>();
	}

	@Override
	public void add(String characterString) {
		this.words.add(characterString);
	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		this.removedDuplicates.clear();
		this.removedDuplicates.addAll(words);
		return this.words.size() - this.removedDuplicates.size();
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		this.removedDuplicates.clear();
		this.removedDuplicates.addAll(words);
		return this.removedDuplicates;
	}

	@Override
	public void empty() {
		this.words.clear();
	}

}
