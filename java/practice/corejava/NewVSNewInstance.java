package practice.corejava;

/**
 * This class gives a comparison between <b>{@code new}</b> operator 
 * and {@link Class#newInstance() newInstance} method.
 * @author Vivek Ranjan Sahu
 */
public final class NewVSNewInstance {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object obj = Class.forName(args[0]).newInstance(); // creates instance dynamically at runtime
		System.out.println(obj.getClass().getName());
		SomeClass some = SomeClass.class.newInstance(); // also can be used at compile time
		System.out.println(some.name);
		SomeClass some1 = new SomeClass(); // can only be used at compile time when the type is known
		System.out.println(some1.name); // same output as above
	}
}
final class SomeClass {
	String name = "This is some class";
}
