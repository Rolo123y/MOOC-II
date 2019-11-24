package week8;

public class Purchase {

	private String product;
	private int amount;
	private int unitPrice;

	public Purchase(String product, int amount, int unitPrice) {
		this.product = product;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}

	public int price() {
		return this.unitPrice * this.amount;
	}

	public void increaseAmount() {
		this.amount++;
	}

	public String toString() {
		return this.product + ": " + this.amount;
	}
}
