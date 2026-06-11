package Day_11;

import java.util.Scanner;

public class factorialfunct {
    static long fact(int n) { // Function to calculate the factorial of a number
        long fact = 1; // Initialize fact to 1

        for (int i = 1; i <= n; i++) { // Loop from 1 to n and multiply fact by i in each iteration
            fact *= i;
        }

        return fact; // Return the calculated factorial
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        long result = fact(num); // Calling the fact function to calculate the factorial of num

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
    
}
