package practice.corejava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * {@link HashMap}
 * @author Vivek Ranjan Sahu
 */
public final class HashMapDemo extends MapDemo {

	public HashMapDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		HashMapDemo key;
		Map<HashMapDemo, String> map = new HashMap<>();
		for (int i = 12340; i < 12351; i++) {
			key = new HashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		for (int i = 0; i < 10; i++) {
			key = new HashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		Iterator<HashMapDemo> iterator = map.keySet().iterator();
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}

}
