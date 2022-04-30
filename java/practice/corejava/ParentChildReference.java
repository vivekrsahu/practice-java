package practice.corejava;

/**
 * This class summarizes all relevant concepts related to reference in inheritence.
 * @author Vivek Ranjan Sahu
 */
public final class ParentChildReference {
	public static void main(String[] args) {
		Parent parentRefParentObj = new Parent();
		Parent parentRefChildObj = new Child(); // used when we don’t know the exact runtime type of the object
		Child childRefChildObject = new Child();
		System.out.println("Parent Reference Parent Object\n=======================================");
		System.out.println(parentRefParentObj.variable);
		parentRefParentObj.method();
		System.out.println("\nParent Reference Child Object\n=======================================");
		System.out.println(parentRefChildObj.variable);
		parentRefChildObj.method();
		System.out.println("\nChild Reference Child Object\n=======================================");
		System.out.println(childRefChildObject.variable);
		childRefChildObject.method();
		childRefChildObject.otherChildMethod();
	}
}
class Parent {
	String variable = "Parent Variable called";
	public void method() {
		System.out.println("Parent Method called");
	}
}
final class Child extends Parent {
	String variable = "Child Variable called";
	@Override
	public void method() {
		System.out.println("Child Method called");
	}
	public void otherChildMethod() {
		System.out.println("Another Child Method called");
	}
}