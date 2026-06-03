package Day_3;

import java.util.Scanner;

public class gcd {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = s.nextInt();

        System.out.print("Enter second number = ");
        int b = s.nextInt();

        int c = a, d = b;

        while (b != 0) { // Euclidean algorithm
            int temp = b; 
            b = a % b; // Update b to the remainder of a divided by b
            a = temp; // Update a to the previous value of b
        }

        System.out.println("GCD of " + c + " and " + d + " = " + a);
    }
    
}
