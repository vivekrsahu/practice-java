package practice.corejava.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * {@link LinkedHashSet}
 * @author Vivek Ranjan Sahu
 */
public class LinkedHashSetDemo extends SetDemo {

	public LinkedHashSetDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		Set<LinkedHashSetDemo> set = new LinkedHashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(new LinkedHashSetDemo(i));
		}
		for (int i = 12345; i < 12355; i++) {
			set.add(new LinkedHashSetDemo(i));
		}
		Iterator<LinkedHashSetDemo> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
