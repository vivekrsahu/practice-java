package practice.corejava.collection.map;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * No need to override <tt>hashCode</tt> & <tt>equals</tt> method as it uses "==" operator
 * to check equality and {@link System#identityHashCode(Object)} for generating hashes.
 * @see	{@link IdentityHashMap}
 * @author Vivek Ranjan Sahu
 */
public final class IdentityHashMapDemo extends MapDemo {

	public IdentityHashMapDemo(int number) {
		super(number);
	}

	@Override
	public int hashCode() {
		// for testing purpose
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// for testing purpose
		return true;
	}

	public static void main(String[] args) {
		IdentityHashMapDemo key;
		Map<IdentityHashMapDemo, String> map = new IdentityHashMap<>();
		for (int i = 0; i < 6; i++) {
			key = new IdentityHashMapDemo(i);
			// first it checks for duplicate key, if found then replaces the old value 
			// (present in the next bucket) with the new one and returns the old value, 
			// else places the provided value in the next bucket and returns null.
			map.put(key, "value");
			key = null;
		}
		Iterator<IdentityHashMapDemo> iterator = map.keySet().iterator();
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}

}