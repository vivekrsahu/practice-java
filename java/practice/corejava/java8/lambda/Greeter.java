package practice.corejava.java8.lambda;

public class Greeter {

	public void greet(Greetable greetable) {
		greetable.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greetable greetableGreeting = new GreetableImpl(); // implementation class is required that implements the method
		greeter.greet(greetableGreeting);

		Greetable anonymousInnerClassGreeting = new Greetable() { // with creating an anonymous inner class
			@Override
			public void perform() {
				System.out.println("Hello Anonymous");
			}
		};
		greeter.greet(anonymousInnerClassGreeting);

		Greetable lambdaGreeting = () -> System.out.println("Hello Lambda"); // the method itself implements the interface, so no use of class
		greeter.greet(lambdaGreeting);

	}

}
