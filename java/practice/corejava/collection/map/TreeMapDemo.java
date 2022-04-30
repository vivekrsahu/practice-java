package practice.corejava.collection.map;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * {@link TreeMap} <br>
 * <tt>TreeMap</tt> solely depends on the comparing operation irrespective of the 
 * code inside equals & hashcode method, so those methods needn't to be overridden.
 * @author Vivek Ranjan Sahu
 */
public final class TreeMapDemo extends MapDemo implements Comparable<TreeMapDemo>{

	public TreeMapDemo(int number) {
		super(number);
	}

	@Override
	public int compareTo(TreeMapDemo object) {
		return (this.getNumber() - object.getNumber());
	}

	public static void main(String[] args) {
		TreeMapDemo key;
		TreeMap<TreeMapDemo, String> map = new TreeMap<>();
		for (int i = 12340; i < 12351; i++) {
			key = new TreeMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		for (int i = 0; i < 10; i++) {
			key = new TreeMapDemo(i);
			map.put(key, "value");
			key = null;
		}
		Iterator<TreeMapDemo> iterator = map.keySet().iterator();
		String value;
		while (iterator.hasNext()) {
			key = iterator.next();
			value = map.get(key);
			System.out.println(key.getNumber() + ": " + value);
		}
	}

}
