package Day_11;

import java.util.Scanner;

public class primefunct {
     static boolean Prime(int n) { // Function to check if a number is prime or not
        if (n <= 1) // If n is less than or equal to 1, it is not a prime number
            return false;

        for (int i = 2; i <= n / 2; i++) { // Check if n is divisible by any number from 2 to n/2
            if (n % i == 0) // If n is divisible by any number, it is not a prime number
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = "); 
        int num = sc.nextInt();

        if (Prime(num))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");

        sc.close();
    }
    
}
