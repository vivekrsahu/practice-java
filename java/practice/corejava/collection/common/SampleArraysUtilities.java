package practice.corejava.collection.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class SampleArraysUtilities {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		String[] arrayReference = {"V", "R", "Sahu"};
		List listReference = Arrays.asList(arrayReference);
		System.out.println(listReference); // [V, R, Sahu]
		arrayReference[1] = "Ranjan";
		System.out.println(listReference); // [V, Ranjan, Sahu]
		listReference.set(0, "Vivek");
		// using java 7
//		for (String array : arrayReference) {
//			System.out.print(array + " "); // Vivek Ranjan Sahu
//		}
		// using java 8 Stream API
		System.out.println(listReference.stream().collect(Collectors.joining(" "))); // Vivek Ranjan Sahu
//		listReference.add("New"); // UnsupportedOperationException
//		listReference.remove("Sahu"); // UnsupportedOperationException
//		listReference.set(0, new Integer(10)); // ArrayStoreException
	}
}
