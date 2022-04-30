package practice.corejava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * {@link ConcurrentHashMap}
 * @author Vivek Ranjan Sahu
 */
public class ConcurrentHashMapDemo extends MapDemo {

	public ConcurrentHashMapDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		ConcurrentHashMapDemo key;
		Map<ConcurrentHashMapDemo, String> map = new ConcurrentHashMap<>();
		for (int i = 0; i < 10; i++) {
			key = new ConcurrentHashMapDemo(i);
			map.put(key, "value");
		}
		System.out.println("ConcurrentHashMap before iterator: " + map);
		Iterator<ConcurrentHashMapDemo> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			key = iterator.next();
			if (3 == key.getNumber()) {
				map.put(new ConcurrentHashMapDemo(333), "ModifiedValue");
			}
		}
		System.out.println("ConcurrentHashMap after iterator: " + map);

		map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			key = new ConcurrentHashMapDemo(i);
			map.put(key, "value");
		}
		System.out.println("HashMap before iterator: " + map);
		iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			key = iterator.next();
			if (3 == key.getNumber()) {
				map.put(new ConcurrentHashMapDemo(333), "ModifiedValue");
			}
		}
		System.out.println("HashMap after iterator: " + map);
	}

}