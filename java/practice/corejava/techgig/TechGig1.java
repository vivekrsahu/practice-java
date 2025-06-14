package practice.corejava.techgig;

import java.io.IOException;
import java.util.Scanner;

public class TechGig1 {
    public static int Consonant(String input1, int input2) {
        return getMinimumLength(input1, input2);
    }

    private static int getMinimumLength(final String input1, int input2) {
        int counter = 0;
        int minimumLength = 0;
        boolean isPreviousCharConsonant = false;
        char previousChar;
        char currentChar;
        int index = 0;
        StringBuilder buffer = new StringBuilder();
        int j;
        for (int i = 0; i < input1.length(); i++) {
            previousChar = input1.charAt(i);
            isPreviousCharConsonant = isConsonant(previousChar);
            for (j = index + i; j < input1.length(); j++) {
                currentChar = input1.charAt(j);
                if (isConsonant(currentChar)) {
                    counter++;
                }
                buffer.append(currentChar);
                if (counter >= input2) {
                    minimumLength = buffer.toString().length();
                    index = minimumLength;
                    index--;
                    buffer.deleteCharAt(0);
                    if (isPreviousCharConsonant) {
                        counter--;
                    }
                    break;
                }
            }
            if (j >= input1.length()) {
                break;
            }
        }
        if (minimumLength == 0) {
            return -1;
        }
        return minimumLength;
    }

    private static boolean isConsonant(char ch) {
        return switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> false;
            default -> true;
        };
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int output;
        String ip1 = in.nextLine().trim();
        int ip2 = Integer.parseInt(in.nextLine().trim());
        output = Consonant(ip1, ip2);
        System.out.println(output);
    }
}
