package Day_4;

import java.util.Scanner;

public class armstrong {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int og = num; // Store the original number for later comparison
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) { // Loop to calculate the sum of the digits raised to the power of the number of digits
            int digit = num % 10;
            sum += Math.pow(digit, digits); // Add the digit raised to the power of the number of digits to the sum
            num = num/10; // Remove the last digit from the number
        }

        if (sum == og) { // Check if the calculated sum is equal to the original number
            System.out.println(og + " is an Armstrong number.");
        } else {
            System.out.println(og + " is not an Armstrong number.");
        }

        sc.close();
    }
    
}
