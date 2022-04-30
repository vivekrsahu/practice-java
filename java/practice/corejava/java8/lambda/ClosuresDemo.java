package practice.corejava.java8.lambda;

public class ClosuresDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		// without actually having the variable b, it can still read the variable inside some anonymous class or lambda block
//		doProcess(a, new Process() {
//			@Override
//			public void process(int i) {
//				System.out.println(i + b); // by default it considers b as final variable and hence won't allow to update
//			}
//		});
		// using lambda
		doProcess(a, i -> System.out.println(i + b)); // i.e., no need to mention the variable as final but it should not be changed
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}