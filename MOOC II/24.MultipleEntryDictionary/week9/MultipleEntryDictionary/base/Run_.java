package week9.MultipleEntryDictionary.base;

import week9.MultipleEntryDictionary.Dictionary.MultipleEntryDictionary;
import week9.MultipleEntryDictionary.Dictionary.PersonalMultipleEntryDictionary;

public class Run_ {

	public static void main(String[] args) throws Exception {
		MultipleEntryDictionary dict = new PersonalMultipleEntryDictionary();
		dict.add("kuusi", "six");
		dict.add("kuusi", "spruce");

		dict.add("pii", "silicon");
		dict.add("pii", "pi");

		System.out.println(dict.translate("kuusi"));
		dict.remove("pii");
		System.out.println(dict.translate("pii"));

	}

}
