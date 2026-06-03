package Day_3;

import java.util.Scanner;

public class primeseries {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter starting number = ");
        int st = s.nextInt();

        System.out.print("Enter ending number = ");
        int end = s.nextInt();

        System.out.println("Prime numbers in given range are :-");

        for (int num = st; num <= end; num++) {
            boolean Prime = true; // Assume number is prime until proven otherwise

            if (num <= 1)
                Prime = false; // 0 and 1 are not prime numbers
            else {
                for (int i = 2; i <= num / 2; i++) { // Check for factors from 2 to num/2
                    if (num % i == 0) { 
                        Prime = false; // If num is divisible by any number other than 1 and itself, it's not prime
                        break;
                    }
                }
            }

            if (Prime) // If the number is prime, print it
                System.out.print(num + " ");
        }
    }
}

    

