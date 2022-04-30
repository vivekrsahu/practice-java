package practice.corejava.collection.map;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * In JDK 1.2, {@link ThreadLocal} was using <tt>WeakHashMap</tt> internally.
 * Now, <tt>ThreadLocal</tt> is using its static inner class 
 * {@link ThreadLocal.ThreadLocalMap ThreadLocalMap} whose
 * {@link ThreadLocal.ThreadLocalMap.Entry Entry} extends {@link WeakReference} 
 * for serving the same purpose.
 * @see {@link WeakHashMap}
 * @author Vivek Ranjan Sahu
 */
public final class WeakHashMapDemo extends MapDemo {

	public WeakHashMapDemo(int number) {
		super(number);
	}

	public static void main(String[] args) {
		WeakHashMapDemo key;
		Map<WeakHashMapDemo, String> map = new WeakHashMap<>();
		for (int i = 12340; i < 12351; i++) {
			key = new WeakHashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		for (int i = 0; i < 10; i++) {
			key = new WeakHashMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		System.out.println("Before Garbage Collection\n===================================");
		Iterator<WeakHashMapDemo> iterator1 = map.keySet().iterator();
		String value;
		while (iterator1.hasNext()) {
			key = iterator1.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
		System.gc();
		System.out.println("After Garbage Collection\n===================================");
		Iterator<WeakHashMapDemo> iterator2 = map.keySet().iterator();
		while (iterator2.hasNext()) {
			key = iterator2.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}

}