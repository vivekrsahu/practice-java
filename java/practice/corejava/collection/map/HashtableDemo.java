package practice.corejava.collection.map;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * {@link Hashtable}
 * @author Vivek Ranjan Sahu
 */
public final class HashtableDemo extends MapDemo {

	public HashtableDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		HashtableDemo key;
		Hashtable<HashtableDemo, String> map = new Hashtable<>();
		for (int i = 12340; i < 12351; i++) {
			key = new HashtableDemo(i);
			map.put(key, "value");
			key = null;
		}
		for (int i = 0; i < 10; i++) {
			key = new HashtableDemo(i);
			map.put(key, "value");
			key = null;
		}
		Iterator<HashtableDemo> iterator = map.keySet().iterator();
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}

}
