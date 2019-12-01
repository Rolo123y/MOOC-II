package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

	private List<Card> hand;

	public Hand() {
		this.hand = new ArrayList<Card>();
	}

	public void add(Card card) {
		hand.add(card);
	}

	public void sort() {
		Collections.sort(hand);
	}

	public void print() {
		for (Card n : hand) {
			System.out.println(n);
		}
	}

	public void sortAgainstSuit() {
		Collections.sort(hand, new SortAgainstSuitAndValue());
	}

	@Override
	public int compareTo(Hand o) {
		int total = 0;
		for (Card n : hand) {
			total += n.getValue();
		}
		for (Card n : o.hand) {
			total -= n.getValue();
		}
		return total;
	}

}
