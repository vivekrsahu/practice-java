package practice.corejava.java8.lambda;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceDemo :: printMessage); // (MethodReferenceDemo :: printMessage) === (() -> printMessage())
		thread.start();
	}

	public static void printMessage() {
		System.out.println("Hello");
	}

}
