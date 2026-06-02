package Day_2;

import java.util.Scanner;

public class pallindrome {
     public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = c.nextInt();

        int og = num; // Store the original number for later comparison
        int rev = 0; // Initialize the variable to hold the reversed number

        while (num > 0) {
            int d = num % 10; // Get the last digit of the number
            rev = rev * 10 + d; // Append the last digit to the reversed number
            num = num / 10; // Remove the last digit from the number
        }

        if (og == rev) { // Check if the original is equal to the reversed
            System.out.println(og+" is a Palindrome Number");
        } else {
            System.out.println(og+" is not a Palindrome Number");
        }
    }
    
}
