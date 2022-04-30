package practice.corejava.exceptionhandling;

/**
 * @since JDK 1.7
 *
 */
public class MultiCatchBlock {
	public void someMethod() {
		try {
			Thread.sleep(10);
		} catch (ArithmeticException | InterruptedException exception) {}
//		} catch (ArithmeticException | Exception exception) {} // invalid because both are interrelated
	}
}
