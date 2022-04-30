package practice.corejava;

/**
 * This class shows a Singleton with eager initialization.
 * @author Vivek Ranjan Sahu
 */
public final class SampleSingleton {
	private static SampleSingleton instance = new SampleSingleton();
	private SampleSingleton() {}
	public static SampleSingleton getInstance() {
		return instance;
	}
}

/**
 * This class shows a Singleton with lazy initialization.
 * @author Vivek Ranjan Sahu
 */
final class SampleSingleton2 {
	private static SampleSingleton2 instance;
	private SampleSingleton2() {}
	public static SampleSingleton2 getInstance() {
		if (instance == null) {
			instance = new SampleSingleton2();
		}
		return instance;
	}
}