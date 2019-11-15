package week7;

import java.util.ArrayList;

public class Changer {

	private ArrayList<Change> changes = new ArrayList<Change>();

	public Changer() {
		this.changes = new ArrayList<>();
	}

	public void addChange(Change change) {
		changes.add(change);
	}

	public String Change(String characterString) {
		for (Change n : changes) {
			characterString = n.change(characterString);
		}
		return characterString;
	}

}
