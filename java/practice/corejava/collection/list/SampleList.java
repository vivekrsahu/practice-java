package practice.corejava.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class provides variations while printing data inside a list.
 * @author Vivek Ranjan Sahu
 */
public final class SampleList {
	private static void printUniqueList(List<String> list1, List<String> list2) {
		List<String> uniqueList = new ArrayList<>();
		List<String> commonList = new ArrayList<>();
		uniqueList.addAll(list1);
		for (String item : list2) {
			if (uniqueList.contains(item)) {
				commonList.add(item);
			} else {
				uniqueList.add(item);
			}
		}
		uniqueList.removeAll(commonList);
		System.out.println(uniqueList);
	}
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C", "D");
		List<String> list2 = Arrays.asList("C", "D", "E", "F");
		SampleList.printUniqueList(list1, list2);
	}
}
