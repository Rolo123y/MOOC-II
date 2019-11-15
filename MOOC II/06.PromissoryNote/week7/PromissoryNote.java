package week7;

import java.util.HashMap;

public class PromissoryNote {

	private HashMap<String, Double> promissoryNote;

	public PromissoryNote() {
		this.promissoryNote = new HashMap<String, Double>();
	}

	public void setLoan(String toWhom, double value) {
		this.promissoryNote.put(toWhom, value);
	}

	public double howMuchIsTheDept(String whose) {
		if (this.promissoryNote.containsKey(whose)) {
			return this.promissoryNote.get(whose);
		}
		return 0;
	}

}
