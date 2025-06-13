package practice.corejava.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAndPasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String inputEmail = scanner.nextLine();
//        System.out.println("Enter your password: ");
//        String inputPassword = scanner.nextLine();

        validateEmail(inputEmail);
//        validatePassword(inputPassword);
    }

    private static void validateEmail(String inputEmail) {
        String regex = "^[a-zA-Z0-9.]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputEmail);
        System.out.println(inputEmail +" : "+ matcher.matches());
    }

    private static void validatePassword(String inputPassword) {

    }

}
