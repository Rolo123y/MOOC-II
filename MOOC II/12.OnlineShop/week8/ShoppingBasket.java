package week8;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

	private Map<String, Purchase> basket;

	public ShoppingBasket() {
		this.basket = new HashMap<String, Purchase>();
	}

	public void add(String product, int price) {
		if (basket.containsKey(product)) {
			basket.get(product).increaseAmount();
		} else {
			Purchase item = new Purchase(product, 1, price);
			basket.put(product, item);
		}
	}

	public int price() {
		int total = 0;
		for (Purchase n : this.basket.values()) {
			total += n.price();
		}
		return total;
	}

	public void print() {
		for (Purchase n : this.basket.values()) {
			System.out.println(n);
		}
	}

}
