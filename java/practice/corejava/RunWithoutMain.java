package practice.corejava;

// this will not run without main method, if main method is present then first static method will execute followed by main method
/**
 * This class concludes that without main method, static block won't be executed.
 * However, if main method is present then static block is executed before the main method.
 * @author Vivek Ranjan Sahu
 */
public final class RunWithoutMain {
	static {
		System.out.println("You can't see me!");
	}
}
