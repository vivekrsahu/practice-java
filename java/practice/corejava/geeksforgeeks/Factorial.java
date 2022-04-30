package practice.corejava.geeksforgeeks;

public class Factorial {

	private static int factorial(int input) {
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact *= i;
		}
		return fact;
	}

	private static int factRecursive(int input) {
		if (input <= 1) {
			return input;
		}
		return input * factRecursive(input - 1);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factRecursive(6));
	}

}
