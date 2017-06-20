package Calc;

public class Calculation {
	public int add(int a, int b) {
		return a + b;
	}

	public int div(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException();

		}
		return a / b;
	}
}
