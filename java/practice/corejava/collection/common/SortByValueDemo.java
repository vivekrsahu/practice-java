package practice.corejava.collection.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * This class shows various ways to sort by value.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class SortByValueDemo {
	private static final String STATEMENT = "\nUsing approach %d:";
	/**
	 * By passing an anonymous implementation of Comparable interface as an argument to {@link Collections#sort(List, java.util.Comparator)}
	 * <br>
	 * Used before Java 8
	 */
	private static void approach1(Map<Integer, String> map) {
		System.out.println(String.format(STATEMENT, 1));
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<Integer, String> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	/**
	 * Sorting of values using Lambda expression.
	 * <br>
	 * @since 1.8
	 */
	private static void approach2(Map<Integer, String> map) {
		System.out.println(String.format(STATEMENT, 2));
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(set);
		Collections.sort(list, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for (Entry<Integer, String> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	/**
	 * Here only the values will be printed in sorted order.
	 * <br>
	 * @since 1.8
	 */
	private static void approach3(Map<Integer, String> map) {
		System.out.println(String.format(STATEMENT, 3));
		map.values().stream().sorted().forEach(System.out::println);
	}
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Vivek");
		map.put(2, "Prabhakar");
		map.put(3, "Rochit");
		map.put(4, "Gyan");
		approach1(map);
		approach2(map);
		approach3(map);
	}
}
