package practice.corejava.collection.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates some important APIs of Collections utility class.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class SampleCollectionsUtilities {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("V");
		list.add("R");
		list.add("S");
		System.out.println("Unsorted list: " + list);
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
		System.out.println("Index of R: " + Collections.binarySearch(list, "R")); // index of R
		System.out.println("Insertion point of T if it has been inserted: " + Collections.binarySearch(list, "T")); // insertionPoint of T if it has been inserted
		System.out.println("Insertion point of W if it has been inserted: " + Collections.binarySearch(list, "W"));
		System.out.println("Insertion point of Z if it has been inserted: " + Collections.binarySearch(list, "Z"));
		Collections.reverse(list);
		System.out.println("Reversed list: " + list);
	}
}
