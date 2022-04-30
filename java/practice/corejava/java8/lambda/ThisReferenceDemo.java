package practice.corejava.java8.lambda;

public class ThisReferenceDemo {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		ThisReferenceDemo object = new ThisReferenceDemo();
		// for anonymous inner class, this means instance of the inner class
		object.doProcess(10, new Process() {
			@Override
			public void process(int i) {
				System.out.println("Value of i is: " + i);
				System.out.println(this); // can be called as it refers to the instance of the inner anonymous class
			}
			@Override
			public String toString() {
				return "This is the anonymous inner class";
			}
		});
		// for lambda block, this means instance of the enclosing class and it will behave accordingly
		object.doProcess(10, i -> {
			System.out.println("Value of i is: " + i);
			// System.out.println(this); // can't be called because it is inside the main method which is static
		});
	}

}
