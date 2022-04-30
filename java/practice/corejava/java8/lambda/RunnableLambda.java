package practice.corejava.java8.lambda;

public class RunnableLambda {

	public static void main(String[] args) {
		Thread someThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable");
			}
		});
		someThread.start();
		// here, lambda function is used as a Runnable implementation because Runnable has only one method 
		// whose signature is identical with the lambda function.
		Thread lambdaThread = new Thread(() -> System.out.println("Lambda Runnable"));
		lambdaThread.start();
	}

}
