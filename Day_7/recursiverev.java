package Day_7;

import java.util.Scanner;

public class recursiverev {
    static int rev = 0;

    static void rev(int n) {
        if (n == 0) // base case: when n becomes 0, we have processed all digits
            return;

        rev = rev * 10 + (n % 10); // recursive case: update rev by adding the last digit of n (n % 10) and shifting the previous digits to the left (rev * 10)
        rev(n / 10); // recursive call: process the remaining digits of n by dividing it by 10 (n / 10)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

        rev(n);

        System.out.println("Reverse of " + n + " = " + rev);
        sc.close();
    }
    
}
