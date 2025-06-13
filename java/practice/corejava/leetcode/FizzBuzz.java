package practice.corejava.leetcode;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        printFizzBuzz(5);
        printFizzBuzz(3);
        printFizzBuzz(15);
    }

    private static void printFizzBuzz(int input) {
        String[] output = new String[input];
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                output[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                output[i - 1] = "Buzz";
            } else {
                output[i - 1] = i + "";
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
