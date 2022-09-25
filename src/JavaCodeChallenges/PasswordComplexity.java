package JavaCodeChallenges;

import java.util.Scanner;

public class PasswordComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? " + isPasswordComplex(userInput));
    }
    public static boolean isPasswordComplex(String password) {
        final int requiredLength = 6;

        final boolean isCorrectLength = password.length() >= requiredLength;

        boolean hasUpperCaseLetter = false;
        boolean hasLowerCaseLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length() && (!hasUpperCaseLetter || !hasDigit || !hasLowerCaseLetter); i++) {
            //keep looping while you still have characters to evaluate and at least one of the variables is false
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCaseLetter = true;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLowerCaseLetter = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }
        }

        return isCorrectLength && hasUpperCaseLetter && hasLowerCaseLetter && hasDigit;
    }
}
