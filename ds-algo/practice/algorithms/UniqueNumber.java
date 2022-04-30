package practice.algorithms;

/**
 * This class prints a unique number that is when divisible by 10 leaves reminder as 9,
 * when divided by 9 leaves reminder 8 and so on.
 * @author Vivek Ranjan Sahu
 */
public final class UniqueNumber {
	public static void main(String[] args) {
		int index = 0;
		for (int number = 0; ; number++) {
			for (int dividor = 10; dividor > 0; dividor--) {
				if ((number % dividor) == (dividor - 1)) {
					index++;
				} else {
					index = 0;
					break;
				}
			}
			if (index == 10) {
				System.out.println(number);
				break;
			}
		}
	}
}
