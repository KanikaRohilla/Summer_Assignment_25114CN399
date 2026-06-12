package Day_12;

import java.util.Scanner;

public class armstrongfunct {
     public static boolean Armstrong(int num) { // Function to check if a number is an Armstrong number
        int og = num; // Store the original number for later comparison
        int sum = 0;
        int digits = String.valueOf(num).length(); // Get the number of digits in the number

        while (num > 0) { // Loop to calculate the sum of the digits raised to the power of the digit itself
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, digits);
            num = num / 10;
        }

        return og == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int og = num; // Store the original number for later comparison

        if (Armstrong(num)) { // Call the function to check if the number is an Armstrong number
            System.out.println(og + " is an Armstrong Number");
        } else {
            System.out.println(og + " is not an Armstrong Number");
        }

        sc.close();
    }
    
}
