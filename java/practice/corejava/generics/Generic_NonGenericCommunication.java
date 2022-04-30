package practice.corejava.generics;

import java.util.*;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Generic_NonGenericCommunication {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Vivek");
		list.add("Ranjan");
//		list.add(10); // invalid because generic
		method(list);
//		list.add(true); // invalid as it again entered to generic scope
		System.out.println(list);
		anotherMethod();
	}

	static void method(List list) {
		list.add(30); // valid because non-generic area, so the list will behave likewise
		list.add(true); // valid because non-generic area, so the list will behave likewise
	}

	static void anotherMethod() {
		List list = new ArrayList<String>();
		list.add(10);
		list.add(true);
		list.add("Sahu");
		// all the above are valid because compiler checks only for the reference type, so it will assume that to be non-generic.
		// as generics concept is not applicable for runtime, so no problem at runtime anyways
		System.out.println(list);
	}

}
