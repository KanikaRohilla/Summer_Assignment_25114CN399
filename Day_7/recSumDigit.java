package Day_7;

import java.util.Scanner;

public class recSumDigit {
     static int sum(int n) {
        if (n == 0)
            return 0; // base case: sum of digits of 0 is 0

        return (n % 10) + sum(n / 10); // recursive case: sum of digits of n is the last digit (n % 10) plus the sum of digits of the remaining number (n / 10)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        System.out.println("Sum of digits of number " + n + " = " + sum(n));
        sc.close();
    }
    
}
