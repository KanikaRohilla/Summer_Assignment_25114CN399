package Day_7;

import java.util.Scanner;

public class recursivefact {
     static int fact(int n) { // method to calculate factorial of a number using recursion
        if (n == 0 || n == 1) // base case: factorial of 0 and 1 is 1
            return 1;
        else
        return n * fact(n - 1); // recursive case: factorial of n is n multiplied by factorial of (n-1)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " = " + fact(n));
        sc.close();
    }
    
}
