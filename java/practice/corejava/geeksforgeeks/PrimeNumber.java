package practice.corejava.geeksforgeeks;

public class PrimeNumber {

	private static boolean isPrime(int input) {
		if (input <= 1) {
			return false;
		}
		if (input == 2 || input == 3) {
			return true;
		}
		if (input % 2 == 0 || input % 3 == 0) {
			return false;
		}
		
		for (int i = 5; i * i <= input; i += 6) {
			if (input % i == 0 || input % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(101));
	}

}
 