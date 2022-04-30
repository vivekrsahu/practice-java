package practice.corejava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class ArithmaticUsingStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		approach1(list);
		approach2(list);
		approach3(list);
		approachFullyOptimized(list);
	}
	private static void approach1(List<Integer> list) {
		// create an implementation object of Stream
		Stream<Integer> stream1 = list.stream();
		// create an implementation object of Function to perform operation on single variable
		Function<Integer, Integer> function = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer value) {
				return value * 2;
			}
		};
		Stream<Integer> stream2 = stream1.map(function);
		// create an implementation object of BinaryOperator to perform cumulative sum operation
		BinaryOperator<Integer> operator = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		Integer result = stream2.reduce(0, operator);
		System.out.println("Using approach1: " + result);
	}
	private static void approach2(List<Integer> list) {
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer value) {
				return value * 2;
			}
		});
		Integer result = stream2.reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer value1, Integer value2) {
				return value1 + value2;
			}
		});
		System.out.println("Using approach2: " + result);
	}
	private static void approach3(List<Integer> list) {
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.map(value -> value * 2);
		Integer result = stream2.reduce(0, (value1, value2) -> value1 + value2);
		System.out.println("Using approach3: " + result);
	}
	private static void approachFullyOptimized(List<Integer> list) {
//		System.out.println("Using fully optimized approach: " 
//				+ list.stream()
//					  .map(value -> value * 2)
//					  .reduce(0, (value1, value2) -> value1 + value2));
		// further simpler
		System.out.println("Using fully optimized approach: " 
				+ list.stream()
					  .map(value -> value * 2)
					  .reduce(0, Integer :: sum)); // google uses map & reduce for easing the search
	}
}
