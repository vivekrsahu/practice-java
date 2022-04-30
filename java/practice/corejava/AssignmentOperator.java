package practice.corejava;

/**
 * This class provides example of all assignment operators.
 * @author Vivek Ranjan Sahu
 */
public final class AssignmentOperator {
	public static void main(String[] args) {
		// simple assignment
		int a = 10;
		int b, c, d;
		// chained assignment
		b = c = d = 10;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		// compound assignment, internal type casting provided
		a += 20;
		System.out.println("a = " + a);
		// other compound assignments are -=, *=, /=, %=, &=, |=, ^=, 
		// >>=, >>>=, <<= unimportant and <<<= doesn't exist
		a -= 10;
		System.out.println("a = " + a);
		a *= 2;
		System.out.println("a = " + a);
		a /= 2;
		System.out.println("a = " + a);
		a %= 7;
		System.out.println("a = " + a);
		a = 30;
		a = a & 9;
		System.out.println("a = " + a);
		a |= 2;
		System.out.println("a = " + a);
		a = 40;
		a = a^2;
		System.out.println("a = " + a);
		byte b1 = 127;
		b1 += 3;
		System.out.println(b1); // -126 because implicit type casting is done by compiler
		int a2, b2, c2, d2;
		a2 = b2 = c2 = d2 = 20;
		a2 += b2 -= c2 *= d2 /= 2;
		System.out.println("a2 = " + a2 + ", b2 = " + b2 + ", c2 = " + c2 + ", d2 = " + d2);
	}
}
