package practice.algorithms;

import java.util.Scanner;

public final class Armstrong {

    private static boolean isArmstrong(int input) {
        int sum = 0;
        int digit;
        int temp = input;
        while(temp > 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, 3);
            temp = temp / 10;
        }
        if (sum == input) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (isArmstrong(input)) {
            System.out.println(input + " is an Armstrong number");
        } else {
            System.out.println(input + " is not an Armstrong number");
        }
    }
}
