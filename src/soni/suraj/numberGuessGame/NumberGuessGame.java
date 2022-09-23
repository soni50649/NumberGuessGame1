package soni.suraj.numberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
        // System.out.println("Random number is " + randomNumber);
        int tryCount = 0;
        final int maxTryCount = 5;
        while (tryCount < maxTryCount) {
            System.out.println("Enter your guess ( 1 - 100 ):");

            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                System.out.println("Correct! You Win!");
                System.out.println("It took you " + tryCount + " tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Nope! the number is higher. Guess again.");
            } else {
                System.out.println("Nope! the number is lower. Guess again.");
            }
            if(tryCount == maxTryCount) {
                System.out.println("You lost! The number was: " + randomNumber);
            }
        }
    }
}
