package practice.corejava.geeksforgeeks;

public class Palindrome {

	private static boolean isPalindrome(int input) {
		int reverse = 0;
		int temp = input;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp = temp / 10;
		}
		return input == reverse ? true : false;
	}

	private static boolean isPalindromeRecursive(int input) {
		return recursive(input, 0) == input ? true : false;
	}

	private static int recursive(int input, int rev) {
		if (input == 0) {
			return rev;
		}
		rev = rev * 10 + input % 10;
		return  recursive(input / 10, rev);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindromeRecursive(12321));
	}

}
