package practice.corejava;

/**
 * This class provides example of few basic arithmatic operations.
 * @author Vivek Ranjan Sahu
 */
public final class ArithmaticOperation {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b; // cannot convert from int to byte
//		result type of (a + b) is max(int, type of a, type of b), so in this case the result type will be max(int, byte, byte) i.e., int
		int c = a + b; // valid
//		byte d = (byte) (a + b); // valid as type casting is done
		System.out.println("c = " + c);
//		b = b + 1; // cannot convert from int to byte
		b++; // valid because internal type casting is done. i.e., {b++ means b = (type of b) (b + 1)}
		b += 1; // valid because internal type casting is done.
		System.out.println("b = " +b);
		b = ++a; // valid
//		10++; // invalid as increment or decrement operator are inapplicable for constants & final variables
//		b = ++ (++a); // invalid, as ++a returns a constant value and hence ++(constant) is invalid
		double a1 = 1.2;
		double b1 = 2.2;
		double c1 = a1 + b1; // valid as max(int, double, double) is double
		System.out.println("c1 = " + c1);
	}

}
