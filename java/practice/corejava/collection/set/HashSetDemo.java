package practice.corejava.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * {@link HashSet}
 * @author Vivek Ranjan Sahu
 */
public class HashSetDemo extends SetDemo {

	public HashSetDemo(int number) {
		super(number);
	}

//	@Override
//	public int hashCode() {
//		// for testing purpose
//		return getNumber().toString().length() == 5 ? 5 : 1;
//	}

	public static void main(String[] args) {
		Set<HashSetDemo> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(new HashSetDemo(i));
		}
		for (int i = 12345; i < 12355; i++) {
			set.add(new HashSetDemo(i));
		}
		Iterator<HashSetDemo> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
