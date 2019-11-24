package week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

	private Map<String, Integer> prices;
	private Map<String, Integer> stocks;

	public Storehouse() {
		this.prices = new HashMap<String, Integer>();
		this.stocks = new HashMap<String, Integer>();
	}

	public void addProduct(String product, int price, int stock) {
		this.prices.put(product, price);
		this.stocks.put(product, stock);
	}

	public int price(String product) {
		for (String n : this.prices.keySet()) {
			if (n.equals(product)) {
				return this.prices.get(n);
			}
		}
		return -99;
	}

	public int stock(String product) {
		for (String n : this.stocks.keySet()) {
			if (n.equals(product)) {
				return this.stocks.get(n);
			}
		}
		return 0;
	}

	public boolean take(String product) {
		for (String n : this.stocks.keySet()) {
			if (n.equals(product)) {
				if (stock(n) > 0) {
					stocks.put(product, stock(n) - 1);
					return true;
				}
			}
		}
		return false;
	}

	public Set<String> products() {
		return this.prices.keySet();
	}

}
