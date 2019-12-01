package week8;

import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {
		if (card1.getSuit() == card2.getSuit()) {
			return card1.getValue() - card2.getValue();
		} else {
			return card1.getSuit() - card2.getSuit();
		}
	}
}
