package week9.DuplicateRemover.tools;

import java.util.Set;

public interface DuplicateRemover {

	void add(String characterString);

	int getNumberOfDetectedDuplicates();

	Set<String> getUniqueCharacterStrings();

	void empty();

}
