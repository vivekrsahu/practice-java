package practice.corejava;

/**
 * This class demonstrates the possible variations of var-args method.
 * @author Vivek Ranjan Sahu
 */
public final class VarArgs {
	private void method(int input) {
		System.out.println("Normal method executed");
	}
	private void method(int... input) {
		System.out.println("VarArgs method executed");
		for (int i : input) {
			System.out.println(i);
		}
	}
	// compilation error because it is same as the above mentioned var-args method
//	private void method(int[] input) {}
	// compilation error because only one var-args param is allowed
//	private void method(int... input1, String... input2) {}
	// compilation error because the var-args param should be present at the last
//	private void method(int... input1, int input2) {}
	private void method(String input1, int... input2) {
		System.out.println("Mixed method executed");
	}
	/**
	 * No compilation error thrown while declaration but compilation error will be 
	 * thrown during invocation of this method due to ambiguity. As the data type of 
	 * both the params is same, during invocation, the compiler gets confused whether 
	 * to invoke method(int... input) or method(int input1, int... input2)
	 */
//	private void method(int input1, int... input2) {}
	public static void main(String[] args) {
		VarArgs vars = new VarArgs();
		vars.method();
		vars.method(1);
		vars.method(15, 20, 21);
		vars.method("", 10, 157, 13);
	}
}
