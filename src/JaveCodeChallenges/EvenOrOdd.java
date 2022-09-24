package JaveCodeChallenges;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userSum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userSum));
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
