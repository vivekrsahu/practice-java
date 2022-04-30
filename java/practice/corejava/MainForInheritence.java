package practice.corejava;

/**
 * This class explains the concept of method hiding.
 * @author Vivek Ranjan Sahu
 */
public class MainForInheritence {
	public static void main(String[] args) {
		System.out.println("Parent");
	}
}

// if main method is not provided then it will execute the parent's main method
final class MainForInheritenceChild extends MainForInheritence {
	// this is method hiding because it is a static method
	public static void main(String[] args) {
		System.out.println("Child");
	}
}