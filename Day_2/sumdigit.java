package Day_2;

import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in); //to take input from the user

        System.out.print("Enter a number = ");
        int n = t.nextInt(); //to store the number

        int sum = 0;

        while (n > 0) {
            int digit = n % 10; //to get the last digit of the number
            sum = sum + digit; //to add the last digit to the sum
            n = n / 10; //to remove the last digit from the number
        }

        System.out.println("Sum of digits = " + sum);
    }
    
}
