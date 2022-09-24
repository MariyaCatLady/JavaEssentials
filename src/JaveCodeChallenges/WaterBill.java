package JaveCodeChallenges;

import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        System.out.println("Your water bill is $" + calculateWaterBill(inputAndValidation()));
    }

    public static double calculateWaterBill(double gallonsUsage) {
        if (gallonsUsage == 0) {
            return 0;
        }

        final double MIN_GALLONS = 1496;
        final double MIN_CHARGES = 18.84;

        if (gallonsUsage > MIN_GALLONS) {
            return calculateAdditionalCharges(gallonsUsage, MIN_GALLONS, MIN_CHARGES);
        }

        return MIN_CHARGES;
    }

    public static double inputAndValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you use this month? ");
        double gallonsUsed = scanner.nextDouble();
        while (gallonsUsed < 0) {
            System.out.println(gallonsUsed + " is an invalid input. Please enter a valid number of gallons.\n");
            System.out.println("How many gallons of water did you use this month? ");
            gallonsUsed = scanner.nextDouble();
        }
        return gallonsUsed;
    }

    public static double calculateAdditionalCharges(double gallonsUsed, double minGallons, double minCharge) {
        final double numberOfGallonsInCCF = 748;
        double CCFs = Math.ceil((gallonsUsed - minGallons) / numberOfGallonsInCCF);
        final double ADDITIONAL_CHARGES = 3.90;
        return minCharge + (CCFs * ADDITIONAL_CHARGES);
    }

}
