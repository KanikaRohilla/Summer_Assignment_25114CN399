package Day_7;

import java.util.Scanner;

public class recursivefib {
        static int fibonacci(int n) {
        if (n == 0) // base case: Fibonacci of 0 is 0
            return 0;
        if (n == 1) // base case: Fibonacci of 1 is 1
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case: Fibonacci of n is the sum of Fibonacci of (n-1) and Fibonacci of (n-2)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position of Fibonacci number = ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number at position " + n + " = " + fibonacci(n));
        sc.close();
    }
    
}
