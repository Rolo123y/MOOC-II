package week7;

import java.util.ArrayList;

public class Calculator {

	private Reader reader;
	private int calculationsDone;
	private ArrayList<Integer> calculations;

	public Calculator() {
		this.reader = new Reader();
		this.calculationsDone = 0;
	}

	public void Start() {
		while (true) {
			System.out.print("command: ");
			String command = reader.readString();
			if (command.equals("end")) {
				break;
			}
			if (command.equals("sum")) {
				sum();
			} else if (command.equals("difference")) {
				difference();
			} else if (command.equals("product")) {
				product();
			}
		}
		statistics();
	}

	private void sum() {
		helper();
		int sum = calculations.get(0) + calculations.get(1);
		System.out.println("sum of the values: " + sum);
	}

	private void product() {
		helper();
		int product = calculations.get(0) * calculations.get(1);
		System.out.println("product of the values: " + product);
	}

	private void difference() {
		helper();
		int difference = calculations.get(0) - calculations.get(1);
		System.out.println("product of the values: " + difference);
	}

	private void helper() {
		calculations = new ArrayList<>();
		System.out.print("Value 1: ");
		int value1 = reader.readInteger();
		System.out.print("value 2: ");
		int value2 = reader.readInteger();
		calculations.add(value1);
		calculations.add(value2);
		calculationsDone++;
	}

	private void statistics() {
		System.out.println("Calculations done: " + calculationsDone);
	}

}
