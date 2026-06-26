package Day_26;

import java.util.Scanner;

public class Quiz {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("----- Simple Quiz -----");

        System.out.println("\nQ1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println("\nQ2. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            score++;
        }

        System.out.println("\nQ3. 10 * 2 / 4  = ?");
        System.out.println("1. 10");
        System.out.println("2. 5");
        System.out.println("3. 8");
        System.out.print("Enter your answer = ");
        answer = sc.nextInt();

        if (answer == 2) {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
    
}
