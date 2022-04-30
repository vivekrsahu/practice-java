package practice.corejava.geeksforgeeks;

public class HCF {

	private static int hcf(int a, int b) {
		int hcf = Math.min(a, b);
		for (int i = hcf; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
				break;
			}
		}
		return hcf;
	}

	public static void main(String[] args) {
		System.out.println(hcf(10, 15));
	}

}
