package practice.corejava;

/**
 * This class aims at providing a basic knowledge on the essential features in Java.
 * @author Vivek Ranjan Sahu
 */
public class Everything {
	private int number;
	private String name;
	public Everything() {
		super();
		System.out.println("I am a constructor");
	}
	public Everything(int number, String name) {
		this();
		this.number = number;
		this.name = name;
	}
	public int getNumber() throws Exception {
		return this.number;
	}
	// return type doesn't come under method signature, so it is irrelevant with overloading perspective.
	public double getNumber(double value) throws ClassCastException {
		return this.number + value;
	}
	public String getName() throws NullPointerException {
		return this.name;
	}
}

final class Something extends Everything {
	@Override
	public int getNumber() throws ClassCastException {
		return 0;
	}
	// narrowing of checked exception is not allowed
//	@Override
//	public double getNumber(double value) throws Exception {
//		return value;
//	}
	// for Overriding, method signature should be same and the return type should either be same or can
	// be the child of its parent class' return type.
//	@Override
//	public double getName() {
//		return 0.0;
//	}
	// any runtime exception can be thrown irrespective of its hierarchy
	@Override
	public String getName() throws ArithmeticException {
		return "Child";
	}
}