package week9;

public class Calculator {

	public int multiplication(int num2) {
		if (num2 < 0) {
			throw new IllegalArgumentException("illegal Argument: parameter is negative!");
		}
		int multiplication = 1;
		for (int i = 1; i <= num2; i++) {
			multiplication *= i;
		}
		return multiplication;
	}

	public int binomailCoefficient(int setSize, int subSet) {
		if (setSize < 0 || subSet < 0 || subSet > setSize) {
			throw new IllegalArgumentException("Illegal Argument!");
		}
		int numerator = multiplication(setSize);
		int denominator = multiplication(subSet) * multiplication(setSize - subSet);

		return numerator / denominator;
	}

}
