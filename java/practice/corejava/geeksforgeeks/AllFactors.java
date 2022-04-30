package practice.corejava.geeksforgeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllFactors {

	private static List<Integer> getAllFactors(int input) {
		List<Integer> factors = new ArrayList<>();
		factors.add(1);
		factors.add(input);
		for (int i = 2; i * i <= input; i++) {
			if (input % i == 0 && !factors.contains(i)) {
				factors.add(i);
				factors.add(input/i);
			}
		}
		return factors.stream().distinct().sorted().toList();
	}

	private static List<Integer> getAllFactorsEfficient(int input) {
		List<Integer> factors = new LinkedList<>();
		int i;
		for (i = 1; i * i < input; i++) {
			if (input % i == 0) {
				factors.add(i);
			}
		}
		for ( ; i >= 1; i--) {
			if (input % i == 0) {
				factors.add(input / i);
			}
		}
		return factors;
	}

	public static void main(String[] args) {
		System.out.println(getAllFactors(100));
		System.out.println(getAllFactorsEfficient(100));
	}

}
