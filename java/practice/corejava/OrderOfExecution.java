package practice.corejava;

/**
 * This class provides a basic idea on the order of execution among 
 * a constructor, a static block, an instance block & the main method.
 * @author Vivek Ranjan Sahu
 */
public final class OrderOfExecution {
	// invoked each time when an object is created.
	public OrderOfExecution() {
		System.out.println("Constructor");
	}
	// invoked each time when an object is created.
	{
		System.out.println("Instance block");
	}
	/** invoked only once i.e., before the main method call, however the JVM will
	 *	check whether a class has a main method before executing the static block
	 */
	static {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println("\nFirst call:");
		new OrderOfExecution();
		System.out.println("Main method");
		System.out.println("\nSecond call:");
		new OrderOfExecution();
	}
}
