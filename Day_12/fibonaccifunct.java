package Day_12;

import java.util.Scanner;

public class fibonaccifunct {
    public static void fibonacci(int n) {// Function to print the Fibonacci series up to n terms
        int first = 0;// Initialize the first two terms of the Fibonacci series
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) { // Loop to print the Fibonacci series up to n terms
            System.out.print(first + " ");

            int next = first + second; // Calculate the next term in the series by adding the previous two terms
            first = second; // Update the first and second terms for the next iteration
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms = ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
    
}
