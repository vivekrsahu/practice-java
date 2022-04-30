package practice.corejava.geeksforgeeks;

public class LCM {

	private static int lcm(int a, int b) {
		int lcm = Math.max(a, b);
		for (int i = lcm; ; i++) {
			if (i % a == 0 && i % b == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
		System.out.println(lcm(10, 15));
	}

}
