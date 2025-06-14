package practice.corejava.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122));
    }

    private static boolean isPalindrome(int x) {
        int temp = 0;
        int input = x;
        while(input > 0) {
            temp = temp * 10 + input % 10;
            input = input / 10;
        }
        return x == temp;
    }

}
