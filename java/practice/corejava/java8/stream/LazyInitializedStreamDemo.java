package practice.corejava.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Here, filter method (i.e., intermediate method) will only filter till it is 
 * required to do so based on the requirement of findFirst method (i.e., terminal method.)
 * @author Vivek Ranjan Sahu
 */
public class LazyInitializedStreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(31, 20, 42, 17, 19);
		findFirstEvenElement(list);
	}
	private static void findFirstEvenElement(List<Integer> list) {
		System.out.println(list.stream()
			.filter(LazyInitializedStreamDemo::isEven)
			.findFirst()
			.orElse(0)); // if no number is even i.e., kind of exception handling
	}
	private static boolean isEven(int number) {
		System.out.println("Printing the number that underwent the filter operation: " + number);
		return number % 2 == 0;
	}
}
