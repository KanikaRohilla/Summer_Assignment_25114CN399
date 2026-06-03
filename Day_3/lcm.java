package Day_3;

import java.util.Scanner;

public class lcm {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = s.nextInt();

        System.out.print("Enter second number = ");
        int b = s.nextInt();

        int n1 = a; // Store the original values of a and b
        int n2 = b;

        while (b != 0) {  // Calculate GCD using Euclidean algorithm
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a; // GCD is now stored in a
        int lcm = (n1 * n2) / gcd; // Calculate LCM using the relationship between GCD and LCM

        System.out.println("LCM = " + lcm);
    }
    
}
