package input_validation;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println("Please change your password.\n");
        System.out.println("New password requirements:\n ");
        System.out.println("1. At least 8 characters long");
        System.out.println("2. Has uppercase letter and a special character");
        System.out.println("3. Cannot contain username ");
        System.out.println("4. Cannot be the same as the old password \n");

        isPasswordValid();
    }

    public static boolean isEightCharacterLong(String newPassword) {
        int nameLength = newPassword.length();
        int requiredLength = 8;

        return nameLength >= requiredLength;
    }

    public static boolean hasUppercaseLetterAndSpecialChar(String newPassword) {
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < newPassword.length() && (!hasUpperCase || !hasSpecialChar); i++) {
            if (Character.isUpperCase(newPassword.charAt(i))) {
                hasUpperCase = true;
            }
            if (!(Character.isDigit(newPassword.charAt(i)) || Character.isLetter(newPassword.charAt(i)))) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasSpecialChar;
    }

    public static boolean doesNotContainUserName(String newPassword, String username) {
        for (int i = 0; i < (newPassword.length() - username.length()) + 1; i++) {
            if (newPassword.substring(i, i + username.length()).equals(username)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotSameAsOld(String newPassword, String oldPassword) {
        return !(newPassword.equals(oldPassword));
    }

    public static void isPasswordValid() {
        Scanner scanner = new Scanner(System.in);

        boolean passwordValid;

        do {
            System.out.println("Enter your username: ");
            String username = scanner.next();

            System.out.println("Enter your password: ");
            String oldPassword = scanner.next();

            System.out.println("Enter your new password: ");
            String newPassword = scanner.next();

            boolean isCorrectLength = isEightCharacterLong(newPassword);
            boolean hasUpperCaseLetter = hasUppercaseLetterAndSpecialChar(newPassword);
            boolean doesNotContainUserName = doesNotContainUserName(newPassword, username);
            boolean isNotSameAsOld = isNotSameAsOld(newPassword, oldPassword);

            if (isCorrectLength && hasUpperCaseLetter && doesNotContainUserName && isNotSameAsOld) {
                System.out.println("Your password is valid.");

                passwordValid = true;
            } else {
                System.out.println("Your password is not valid." + "\n");
                System.out.println("Error(s): ");

                if (!isCorrectLength) {
                    System.out.println("Your password is less than 8 characters long.");
                }
                if (!hasUpperCaseLetter) {
                    System.out.println("Your password does not have an uppercase letter and/or special character.");
                }
                if (!doesNotContainUserName) {
                    System.out.println("Your password contains the username.");
                }
                if (!isNotSameAsOld) {
                    System.out.println("Your new password is the same as your old one.");
                }

                System.out.println();

                passwordValid = false;
            }
        } while (!passwordValid);
    }
}