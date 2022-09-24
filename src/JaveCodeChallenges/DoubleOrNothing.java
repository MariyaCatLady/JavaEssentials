package JaveCodeChallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    //data fields
    private final int START_POINTS = 10;
    private int points = START_POINTS;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private boolean keepPlaying = true;


    public void playGame() {
        this.welcomeMessage();
        this.continuePlaying();

        while (this.keepPlaying) {
            if (this.shouldPointsDouble()) {
                this.doublePoints();
                this.continuePlaying();
            } else {
                this.lostPoints();
            }
        }
        this.finalPoints();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the Double or Nothing game!\n\nYou have " + this.points + " points to start the game with.");
    }

    public boolean shouldPointsDouble() {
        return this.random.nextInt(2) == 1;
    }

    public void continuePlaying() {
        System.out.println("Do you want to keep playing?");
        String userInput = this.scanner.next();

        if (userInput.equalsIgnoreCase("no")){
            this.keepPlaying = false;
        }
    }

    public void doublePoints() {
        this.points *= 2;
        System.out.println("Congratulations! You have doubled your points to " + points + " points.");
    }

    public void lostPoints() {
        this.points = 0;
        System.out.println("Unfortunately, you lost all your points.");
        this.keepPlaying = false;
    }

    public void finalPoints() {
        System.out.println("\nYou ended the game with " + this.points + " points.");
    }
}
