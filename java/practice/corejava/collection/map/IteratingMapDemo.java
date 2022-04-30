package practice.corejava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 10000; i++) {
			map.put(i, "Value" + i);
		}
		// using enhanced for loop to iterate entrySet of the map
		System.out.println("Using for loop on entrySet\n==========================");
		long start = System.nanoTime();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " = " + entry.getValue());
		}
		long time1 = System.nanoTime() - start;

		// using enhanced for loop to iterate keySet of the map
		System.out.println("\nUsing for loop on keySet\n==========================");
		start = System.nanoTime();
		for (Integer entry : map.keySet()) {
			System.out.print(entry + " = " + map.get(entry));
		}
		long time2 = System.nanoTime() - start;

		// using iterator to iterate entrySet of the map
		System.out.println("\nUsing iterator on entrySet\n==========================");
		start = System.nanoTime();
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.print(entry.getKey() + " = " + entry.getValue());
		}
		long time3 = System.nanoTime() - start;

		// using iterator to iterate keySet of the map
		System.out.println("\nUsing iterator on keySet\n==========================");
		start = System.nanoTime();
		Iterator<Integer> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			Integer entry = keyIterator.next();
			System.out.print(entry + " = " + map.get(entry));
		}
		long time4 = System.nanoTime() - start;

		// using lambda expression
		System.out.println("\nUsing foreach loop\n==========================");
		start = System.nanoTime();
		map.forEach((key, value) -> System.out.print(String.format("%s = %s", key, value)));
		long time5 = System.nanoTime() - start;
		System.out.println("\n\nfor entrySet=      " + time1 
							+ "\nfor keySet=        " + time2 
							+ "\niterator entrySet= " + time3 
							+ "\niterator keySet=   " + time4 
							+ "\nlambda=            " + time5);
	}
}
