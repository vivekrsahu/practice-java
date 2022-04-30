package practice.corejava.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * {@link ArrayList} <br>
 * Should be preferred for searching operations. Modification operations are costly due to re-indexing.
 * @author Vivek Ranjan Sahu
 */
public class ArrayListDemo extends ListDemo {

	public ArrayListDemo(int number) {
		super(number);
	}

	public static void main(String[] args) {
		// default capacity is 10 i.e., capacity of the internal array
		ArrayList<ArrayListDemo> list = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			list.add(new ArrayListDemo(i));
		}
		// here re-indexing happens and hence costly
		list.add(2, new ArrayListDemo(58));
		// internal array is full now
		list.add(null);
		// dynamic expansion is 1.5, so new internal array is created with 15 as capacity having 11 elements now
		list.add(new ArrayListDemo(58));
		// creates a new internal array of capacity as same as the list size and copies all the elements there.
		list.trimToSize();
		// again a new internal is created and all the elements are copied there,
		// now capacity = 11 * 1.5 = 16 and size = 12
		list.add(null);
		ListIterator<ArrayListDemo> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		ArrayList<ArrayListDemo> collection = new ArrayList<>();
		collection.add(new ArrayListDemo(5));
		collection.add(new ArrayListDemo(6));
		collection.add(new ArrayListDemo(10));
		collection.add(new ArrayListDemo(58));
		collection.add(null);
		// retains all elements that are also present in the collection
		list.retainAll(collection);
		System.out.println(list);
	}
}
