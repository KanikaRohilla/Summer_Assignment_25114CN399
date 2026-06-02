package Day_2;

import java.util.Scanner;

public class productdigit {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = e.nextInt(); // Read the input number

        int prod = 1; // Initialize product to 1 (multiplicative identity)

        while (num > 0) {
            int d = num % 10; // Get the last digit of the number
            prod = prod * d; // Multiply the last digit with the product
            num = num / 10; // Remove the last digit from the number
        }

        System.out.println("Product of digits = " + prod);
    }
    
}
