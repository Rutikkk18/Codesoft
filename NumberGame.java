import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
		
        int totalRounds = 0;
        int totalAttempts = 0;
        int roundsWon = 0;
		boolean playAgain = true;
        Scanner r = new Scanner(System.in);
        Random k = new Random();
        

        while (playAgain)
			{
            totalRounds++;
            int numberToGuess = k.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean GuessedCorrectly = false;

            System.out.println("Round " + totalRounds);
            System.out.println("I have set a number in my mind between 1 and 100. Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = r.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You get it. congo!");
                    GuessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!GuessedCorrectly) {
                System.out.println("your attempts are over. The number was: " + numberToGuess);
            }

            System.out.println("Round " + totalRounds + " score: " + (GuessedCorrectly ? (maxAttempts - attempts + 1) : 0));
            System.out.print("Do you want to play another round? (yes/no): ");
            String response =r.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game Over. You played " + totalRounds + " rounds and made " + totalAttempts + " attempts.");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total score: " + (roundsWon * 100 - (totalAttempts - roundsWon)));
        r.close();
    }
}
