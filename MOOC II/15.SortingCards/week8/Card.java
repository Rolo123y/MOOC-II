package week8;

public class Card implements Comparable<Card> {

	public static final int SPADES = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;

	private static final String[] SUITS = { "Spades", "Diamonds", "Hearts", "Clubs" };
	private static final String[] VALUES = { "-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
			"A" };

	private int value;
	private int suit;

	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;
	}

	public int getValue() {
		return this.value;
	}

	public int getSuit() {
		return this.suit;
	}

	@Override
	public String toString() {
		return VALUES[this.value] + " of " + SUITS[this.suit];
	}

	@Override
	public int compareTo(Card Other) {
		if (this.value == Other.value) {
			return this.suit - Other.suit;
		} else {
			return this.value - Other.value;
		}
	}
}
