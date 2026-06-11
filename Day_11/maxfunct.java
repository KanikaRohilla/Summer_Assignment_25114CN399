package Day_11;

import java.util.Scanner;

public class maxfunct {
     static int Max(int a, int b) { // Function to find the maximum of two numbers
        if (a > b) // If a is greater than b, return a
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        int max = Max(num1, num2); // Calling the Max function to find the maximum of num1 and num2

        System.out.println("Largest from " + num1 + " and " + num2 + " = " + max);

        sc.close();
    }
    
}
