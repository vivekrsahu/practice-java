package practice.corejava.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GenericsClass<T extends Number> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<?> list = new ArrayList<>(); // since JDK 1.7
		List<?> list1 = new ArrayList<String>();
		List<? extends Number> list2 = new ArrayList<Integer>();
		List<? super Number> list3 = new ArrayList<Object>();
		// while object creation only exact type should be used
//		List<?> list4 = new ArrayList<?>(); // invalid
//		List<?> list5 = new ArrayList<? extends Number>(); // invalid
	}
	@SuppressWarnings({ "unchecked", "unused", "deprecation" })
	static <E> void method() throws Exception {
//		E object = new E(); // can't instantiate as type is unknown during runtime
		E object = (E) GenericsClass.class.newInstance(); // possible as it is a static method
	}
	void anotherMethod() {
//		T anotherObject = new T(); // can't instantiate as type is unknown during runtime
		// T anotherObject = (T) GenericsClass.class.newInstance(); // invalid
		// as it is an instance method and GenericsClass.class.newInstance() is class level
	}
}

class OtherClass<T extends Runnable> {}

// after & only interfaces should be declared, so two classes can never be declared as bounded type parameters
@SuppressWarnings("rawtypes")
class AnotherClass<XYZ extends HashSet & Collection> {}
@SuppressWarnings("rawtypes")
class SomeOtherClass<A extends TreeSet & Collection & Set> {}
//class InvalidClass<T extends Set & HashSet> {} // invalid

// only interfaces can also be used as bounded type parameters
@SuppressWarnings("rawtypes")
class YetAnotherClass<E extends Collection & Set> {}

@SuppressWarnings("rawtypes")
class ThisIsAlsoPossible<T extends Number, ABC extends Map, V extends Runnable, K extends Collection> {
	// Wildcard character
	void method (List<?> list) {}
	void method (T num1, T num2) {}
	void otherMethod (List<? extends Number> list) {}
	void anOtherMethod (List<? super Number> list) {}
	void yetAnotherMethod (List<OtherClass> list) {}
	void myMethod(List<? extends HashSet<String>> list) {
//		list.add(new HashSet<>());
		list.add(null); // only this is possible
	}
	@SuppressWarnings("unused")
	<E> void myOtherMethod() {
		List<E> list1 = new ArrayList<>(); // E is defined in the method type parameter, hence valid
		List<T> list2 = new ArrayList<>(); // E is defined in the class type parameter, hence valid
	}
}

class NewClass {
	// invalid because both method becomes same after type erasure
//	void someMethod(List<String> list) {}
//	void someMethod(List<Integer> list) {}
}