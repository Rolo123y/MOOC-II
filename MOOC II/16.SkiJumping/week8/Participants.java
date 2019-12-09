package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participants {

	private List<Person_> participants;

	public Participants() {
		this.participants = new ArrayList<Person_>();
	}

	public void addParticipant(String fname) {
		if (fname.equals("")) {
			return;
		}
		Person_ Person = new Person_(fname);
		this.participants.add(Person);
	}

	public List<Person_> getReversed() {
		Collections.sort(this.participants);
		Collections.reverse(this.participants);
		return this.participants;
	}

	public void printReversed() {
		Collections.sort(this.participants);
		Collections.reverse(this.participants);
		for (int i = 0; i < this.participants.size(); i++) {
			System.out.println((i + 1) + ". " + this.participants.get(i));
		}
	}

	public void printFinalResults() {
		Collections.sort(this.participants);
		for (int i = 0; i < this.participants.size(); i++) {
			System.out.println(
					(i + 1) + "\t\t" + this.participants.get(i) + "\n\t\t" + this.participants.get(i).printJumps());
		}
	}
}
