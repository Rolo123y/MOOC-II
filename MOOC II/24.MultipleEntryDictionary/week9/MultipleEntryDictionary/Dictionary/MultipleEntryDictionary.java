package week9.MultipleEntryDictionary.Dictionary;

import java.util.Set;

public interface MultipleEntryDictionary {
	void add(String word, String translation);

	Set<String> translate(String word) throws Exception;

	void remove(String word) throws Exception;
}
