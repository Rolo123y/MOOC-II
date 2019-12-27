package week9.DuplicateRemover.Base;

import week9.DuplicateRemover.tools.DuplicateRemover;
import week9.DuplicateRemover.tools.PersonalDuplicateRemover;

public class Run_ {

	public static void main(String[] args) {

		DuplicateRemover remover = new PersonalDuplicateRemover();
		remover.add("first");
		remover.add("second");
		remover.add("first");
		remover.add("first");

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		remover.add("last");
		remover.add("last");
		remover.add("new");

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		System.out.println("Unique characterStrings: " + remover.getUniqueCharacterStrings());

		remover.empty();

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		System.out.println("Unique characterStrings: " + remover.getUniqueCharacterStrings());

	}

}
