package practice.corejava.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * {@link LinkedList} <br>
 * Should be preferred for update operations. Searching operations are costly 
 * because it searches each element node by node. <br> It also supports
 * queue operations like peek, poll etc. as LinkedList also implements Deque.
 * @author Vivek Ranjan Sahu
 */
public class LinkedListDemo extends ListDemo {

	public LinkedListDemo(int number) {
		super(number);
	}

	public static void main(String[] args) {
		// no initial capacity as it works on doubly linked nodes
		LinkedList<LinkedListDemo> list = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new LinkedListDemo(i));
		}
		// allows null
		list.add(null);
		// allows duplicates & adds the element at the first position
		list.addFirst(null);
		ListIterator<LinkedListDemo> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		// removes the first found element (i.e., first null) only
		list.remove(null);
		System.out.println(list);
		// maximum no. of iterations can be size/2 and hence costly operation as it checks each element
		System.out.println(list.get(7));
		System.out.println(list.peek()); // retrieves the head of the list but doesn't remove
	}

}
