package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person_ implements Comparable<Person_> {

	private String fName;
	private List<Integer> Scores;
	private List<Integer> Jumps;

	public Person_(String fName) {
		this.fName = fName;
		this.Scores = new ArrayList<Integer>();
		this.Jumps = new ArrayList<Integer>();
	}

	public String getfName() {
		return this.fName;
	}

	public void addScore(int score) {
		this.Scores.add(score);
	}

	public int getScore(int round) {
		return this.Scores.get(round - 1);
	}

	public void addJump(int jump) {
		this.Jumps.add(jump);
	}

	public int getJump(int round) {
		return this.Jumps.get(round);
	}

	public int Total() {
		int total = 0;
		if (this.Scores.isEmpty() == false) {
			for (int n : this.Scores) {
				total += n;
			}
		} else {
			return 0;
		}
		return total;
	}

	public String printJumps() {
		return "Jump Lengths (m): " + Arrays.toString(this.Jumps.toArray());
	}

	@Override
	public String toString() {
		return this.fName + " (" + Total() + " points)";
	}

	@Override
	public int compareTo(Person_ Other) {
		if (this.Total() == Other.Total()) {
			return Other.fName.compareToIgnoreCase(this.fName);
		} else {
			return Other.Total() - this.Total();
		}
	}
}
