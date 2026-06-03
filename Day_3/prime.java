package Day_3;

import java.util.Scanner;

public class prime {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = s.nextInt();

        boolean Prime = true;

        if (num <= 1) { // 0 and 1 are not prime numbers
            Prime = false;
        } else { 
            for (int i = 2; i <= num / 2; i++) { // Check for factors from 2 to num/2
                if (num % i == 0) {
                    Prime = false; 
                    break; // If a factor is found, the number is not prime
                }
            }
        }
         if (Prime)
            System.out.println(num + " is a Prime Number"); // If no factors are found, the number is prime
        else
            System.out.println(num + " is not a Prime Number");
    }
}