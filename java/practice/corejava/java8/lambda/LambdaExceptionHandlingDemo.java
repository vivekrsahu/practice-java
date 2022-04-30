package practice.corejava.java8.lambda;

import java.util.function.BiConsumer;

public class LambdaExceptionHandlingDemo {
	public static void main(String[] args) {
		int [] someNumbers = {1, 2, 3, 4};
		int key = 0;
		process(someNumbers, key, wrapperLambda((number, keyValue) -> System.out.println(number / keyValue)));
	}
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int number : someNumbers) {
			consumer.accept(number, key);
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (number, keyValue) -> {
			try {
				consumer.accept(number, keyValue);
			} catch (ArithmeticException exception) {
				System.out.println("Arithmetic Exception");
			}
		};
	}
}
