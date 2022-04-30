package practice.corejava.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * {@link LinkedHashMap}
 * @author Vivek Ranjan Sahu
 */
public final class LinkedHashMapDemo extends MapDemo {

	public LinkedHashMapDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		LinkedHashMap<LinkedHashMapDemo, String> map = new LinkedHashMap<>();
		//map.clone(); // returns HashMap instance as it uses HashMap's clone()
		LinkedHashMapDemo key;
		for (int i = 12340; i < 12351; i++) {
			key = new LinkedHashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		for (int i = 0; i < 10; i++) {
			key = new LinkedHashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		Iterator<LinkedHashMapDemo> iterator = map.keySet().iterator();
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}
}
