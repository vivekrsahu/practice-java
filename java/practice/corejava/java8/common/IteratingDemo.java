package practice.corejava.java8.common;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public final class IteratingDemo {
	public static void main(String[] args) {
		List<PersonBean> personList = Arrays.asList(
                new PersonBean("Vivek", "Ranjan", 25),
                new PersonBean("Vivu", "Rajan", 32),
                new PersonBean("Biku", "Babu", 25),
                new PersonBean("ABC", "XYZ", 13),
                new PersonBean("Viras", "Sahu", 25)
            );
		// external iterations i.e., iterating by fetching the element outside
		traverseUsingForLoop(personList);
		traverseUsingEnhancedForLoop(personList);
		traverseUsingIterator(personList);
		// internal iteration i.e., without fetching the element outside
		traverseUsingForEachActual(personList);
		traverseUsingForEachOptimized(personList);
	}
	/** For traversing within some specified indexes */
	private static void traverseUsingForLoop(List<?> list) {
		System.out.println("\nTraversing using for loop\n=============================================");
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
	/** For traversing all items */
	private static void traverseUsingEnhancedForLoop(List<?> list) {
		System.out.println("\nTraversing using enhanced for loop\n=============================================");
		for (Object item : list) {
			System.out.println(item);
		}
	}
	/** For traversing & updating collections if required and supported */
	private static void traverseUsingIterator(List<?> list) {
		System.out.println("\nTraversing using iterator\n=============================================");
		Iterator<?> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	/** For traversing without fetching the element.
	 *  @since JDK 1.8 */
	private static void traverseUsingForEachActual(List<?> list) {
		System.out.println("\nTraversing using forEach loop\n=============================================");
		list.forEach(new Consumer<Object>() {
			@Override
			public void accept(Object object) {
				System.out.println(object);
			}
		});
	}
	/** For traversing without knowing the internal implementation of the forEach loop
	 *  @since JDK 1.8 */
	private static void traverseUsingForEachOptimized(List<?> list) {
		System.out.println("\nTraversing using optimized forEach loop\n=============================================");
//		list.forEach(item -> {
//			System.out.println(item);
//		});
		// or
//		list.forEach(action -> System.out.println(action));
		// using method reference
		list.forEach(System.out :: println);
	}
}
