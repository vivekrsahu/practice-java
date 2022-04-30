package practice.corejava.collection.common;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * This class demonstrates all cursors in java.
 * 
 * @author Vivek Ranjan Sahu
 */
public final class SampleCursor {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Vector vector = new Vector<>();
		Enumeration enumObj = vector.elements();
		Iterator iterObj1 = vector.iterator();
		ListIterator listIterObj1 = vector.listIterator();
		System.out.println(enumObj.getClass().getName()); // java.util.Vector$1 - 1 means anonymous class inside Vector that implements Enumeration
		System.out.println(iterObj1.getClass().getName()); // java.util.Vector$Itr - Itr is the class inside Vector that implements Iterator
		System.out.println(listIterObj1.getClass().getName()); // java.util.Vector$ListItr - ListItr is the class inside Vector that implements ListIterator

		List list = new ArrayList<>();
		Iterator iterObj2 = list.iterator();
		ListIterator listIterObj2 = list.listIterator();
		System.out.println(iterObj2.getClass().getName()); // java.util.ArrayList$Itr - Itr is the class inside ArrayList that implements Iterator
		System.out.println(listIterObj2.getClass().getName()); // java.util.ArrayList$ListItr - ListItr is the class inside ArrayList that implements ListIterator
	}
}
