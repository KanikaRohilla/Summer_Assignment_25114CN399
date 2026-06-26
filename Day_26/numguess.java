 package Day_26;

 import java.util.Random;
import java.util.Scanner;

public class numguess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(100) + 1; // Generate number between 1 and 100
        int guess = 0;
        int attempts = 0;
        int maxAttempt = 3; // Maximum number of attempts

        System.out.println("----- Number Guessing Game -----");
        System.out.println(" --You have only 3 attempts to guess the number--");

        while (attempts < maxAttempt) {

            System.out.println("\nAttempt " + (attempts + 1) + " of " + maxAttempt);
            System.out.print("Enter your guess = ");
            guess = sc.nextInt();

            attempts++; // Increase attempt count

            if (guess == num) {
                System.out.println("Congratulations! You guessed the correct number.");
                break; // Exit the loop if guessed correctly
            } else if (guess > num) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }

            if (attempts < maxAttempt) {
                System.out.println("Attempts left = " + (maxAttempt - attempts));
            }
        }

        if (attempts == maxAttempt && guess != num) {
            System.out.println("\nSorry! You have used all 3 attempts.");
            System.out.println("The correct number was = " + num);
        }

        sc.close();
    }
}