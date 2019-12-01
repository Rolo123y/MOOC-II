package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main15 {

	public static void main(String[] args) {

		// Ascending Order: spades -> diamonds -> hearts -> clubs
		// 2 -> 3 ... -> 14

		Hand hand = new Hand();

		hand.add(new Card(12, Card.HEARTS));
		hand.add(new Card(4, Card.CLUBS));
		hand.add(new Card(2, Card.DIAMONDS));
		hand.add(new Card(14, Card.CLUBS));
		hand.add(new Card(7, Card.HEARTS));
		hand.add(new Card(2, Card.CLUBS));

		hand.sortAgainstSuit();

		hand.print();
	}

}
