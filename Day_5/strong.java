package Day_5;

import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int og = num;
        int sum = 0;

        //strong number is a number that is equal to the sum of the factorials of its digits

        while (num > 0) { // Loop to calculate the sum of the factorials of the digits
            int digit = num % 10; // Get the last digit of the number
            int fact = 1; // Variable to store the factorial of the digit

            for (int i = 1; i <= digit; i++) { // Loop to calculate the factorial of the digit
                fact = fact*i;
            }

            sum += fact; // Add the factorial of the digit to the sum
            num /= 10;
        }

        if (sum == og) {
            System.out.println(og + " is a Strong Number");
        } else {
            System.out.println(og + " is not a Strong Number");
        }

        sc.close();
    }
    
}
