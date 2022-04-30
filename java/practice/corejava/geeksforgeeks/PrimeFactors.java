package practice.corejava.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	private static List<Integer> primeFactors(int input) {
		int num = input;
		List<Integer> primeFactors = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				primeFactors.add(i);
				num = num / i;
				i--;
			}
		}
		return primeFactors;
	}

	private static List<Integer> uniquePrimeFactors(int input) {
		int num = input;
		List<Integer> primeFactors = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				if (!primeFactors.contains(i)) {
					primeFactors.add(i);
				}
				num = num / i;
				i--;
			}
		}
		return primeFactors;
	}

	public static void main(String[] args) {
		System.out.println(primeFactors(450));
		System.out.println(uniquePrimeFactors(450));
	}

}
