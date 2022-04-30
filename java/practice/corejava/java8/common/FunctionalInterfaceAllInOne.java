package practice.corejava.java8.common;

@FunctionalInterface
public interface FunctionalInterfaceAllInOne {

    // the only abstract method
	void onlyOneAbstractMethod();

	// if uncommented then compilation error as a functional interface must contain only 1 abstract method
//	void anotherMethod();

	// it is also possible as it is overriding Object class' methods.
//	boolean equals(Object obj);
//	String toString();

	// A default method cannot override a method from Object class
//	default boolean equals(Object obj) {
//      return true;
//	}

	// other concrete methods
	default void someMethod() {
	}
	default void someMoreMethod() {
	}
	static void someStaticMethod() {
	}
}

interface OtherInterface {
    default void someMethod() {
    }
    default void someMoreMethod() {
    }
}

class Parent {
    public void someMethod() {
    }
}

class Child extends Parent implements FunctionalInterfaceAllInOne, OtherInterface {
    // needed to override as it is an abstract method
    @Override
    public void onlyOneAbstractMethod() {
    }
    // have to override in order to resolve diamond problem
    public void someMoreMethod() {
    }
    // however needn't to override this method as it by default inherits from its parent class
//    public void someMethod() {
//    }
}
