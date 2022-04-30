package practice.corejava.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * {@link TreeSet}
 * @author Vivek Ranjan Sahu
 */
public final class TreeSetDemo extends SetDemo implements Comparable<TreeSetDemo>{

	public TreeSetDemo(int number) {
		super(number);
	}

	@Override
	public int compareTo(TreeSetDemo object) {
		return (this.getNumber() - object.getNumber());
	}

	public static void main(String[] args) {
		TreeSet<TreeSetDemo> set = new TreeSet<>();
		for (int i = 12340; i < 12351; i++) {
			set.add(new TreeSetDemo(i));
		}
		for (int i = 0; i < 10; i++) {
			set.add(new TreeSetDemo(i));
		}
		Iterator<TreeSetDemo> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
