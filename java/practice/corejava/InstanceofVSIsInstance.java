package practice.corejava;

/**
 * This class gives a comparison between <b>{@code instanceof}</b> operator 
 * and {@link Class#isInstance(Object) isInstance} method.
 * @author Vivek Ranjan Sahu
 */
public final class InstanceofVSIsInstance {
	public static void main(String[] args) throws ClassNotFoundException {
		Thread t = new Thread();
		System.out.println(Class.forName(args[0]).isInstance(t)); // checking instance dynamically during runtime
		if (t instanceof Runnable) { // checking instance during compile time, the type must be known
			System.out.println(true);
		}
	}
}
