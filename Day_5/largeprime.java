package Day_5;

import java.util.Scanner;

public class largeprime {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int largest = 1; // Variable to store the largest prime factor

        for (int i = 2; i <= num; i++) { // Loop to find the factors of the number
            if (num % i == 0) { // Check if the current number is a factor of the original number

                boolean Prime = true;

                for (int j = 2; j <= i / 2; j++) { // Loop to check if the current factor is prime
                    if (i % j == 0) { // If the current factor is divisible by any number other than 1 and itself, it is not prime
                        Prime = false;
                        break;
                    }
                }

                if (Prime) { // If the current factor is prime, check if it is greater than the current largest prime factor
                    largest = i; // Update the largest prime factor if the current factor is prime and greater than the current largest
                }
            }
        }

        System.out.println("Largest Prime Factor of " + num + " is = " + largest);

        sc.close();
    }
    
}
