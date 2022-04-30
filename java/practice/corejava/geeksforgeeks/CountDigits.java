package practice.corejava.geeksforgeeks;

public class CountDigits {

	private static int countDigits(int input) {
		int count = 0;
		while(input > 0) {
			input = input / 10;
			count++;
		}
		return count;
	}

	private static int countDigitsEffective(int input) {
		return (int) (Math.floor(Math.log10(input))) + 1;
	}

	public static void main(String[] args) {
		System.out.println(countDigits(100));
		System.out.println(countDigitsEffective(999435556));
	}

}
