package games;

import java.util.Random;

public class RollTheDie {
    public static void main(String[] args) {
        Random random = new Random();

        final int totalNumberOfRolls = 5;
        int currentSpace = 0;
        final int lastSpace = 20;

        System.out.println("Welcome to the Roll the Die game!");
        System.out.println();

        for (int i = 1; i <= totalNumberOfRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;

            System.out.print("Roll #" + (i) + ": You've rolled a " + die);

            if (currentSpace < lastSpace) {
                System.out.print(". You're now on space " + currentSpace + " and have " + (lastSpace - currentSpace) + " spaces to go.");
                if(i == totalNumberOfRolls){
                    System.out.println(" Unfortunately, you did not make it to all " + lastSpace + " spaces. You lose.");
                }
                System.out.println();
            } else if (currentSpace == lastSpace) {
                System.out.println(". You're on space " + lastSpace + ". Congrats, you win!");
                break;
            } else {
                System.out.println(". Unfortunately, you're now past the last space. You lose.");
                break;
            }

            System.out.println();
        }
    }
}
