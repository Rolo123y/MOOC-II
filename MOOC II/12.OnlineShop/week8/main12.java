package week8;

import java.util.Scanner;

public class main12 {

	public static void main(String[] args) {
		Storehouse store = new Storehouse();
		store.addProduct("coffee", 5, 10);
		store.addProduct("milk", 3, 20);
		store.addProduct("milkbutter", 2, 55);
		store.addProduct("bread", 7, 1);

		Shop shop = new Shop(store, new Scanner(System.in));
		shop.manage("Pekka");
	}
}