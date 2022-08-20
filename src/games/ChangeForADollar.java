package games;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Change for a Dollar Game! Your goal is to enter enough change to make exactly $1.");

        System.out.println("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.println("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.println("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.println("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        scanner.close();

        int totalCents = pennies + (5 * nickels) + (10 * dimes) + (25 * quarters);

        if (totalCents == 100) {
            System.out.println("You have exactly $1.00. You win!");
        } else if (totalCents < 100) {
            int change = 100 - totalCents;
            System.out.println("You need " + change + " more cents in change. You lose.");
        } else {
            int change = totalCents - 100;
            System.out.println("You have " + change + " more cents in change. You lose.");
        }

    }
}
