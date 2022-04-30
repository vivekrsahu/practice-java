package practice.corejava;

/**
 * This class states that there is no special precedence for operand 
 * and an operation will be performed according to operators precedence only.
 * @author Vivek Ranjan Sahu
 */
public final class OperatorOperandPrecedence {
	public static void main(String[] args) {
		// purely based on operators precedence
		System.out.println(method(1) + method(2) * method(3) / method(4) + method(5) * method(6));
	}
	private static int method(int i) {
		System.out.println(i); // in order to show the order of invocation, i.e., no operand precedence
		return i;
	}
}
