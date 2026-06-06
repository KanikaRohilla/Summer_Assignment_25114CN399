package Day_6;

import java.util.Scanner;

public class power {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base = ");
        int x = sc.nextInt();

        System.out.print("Enter power = ");
        int n = sc.nextInt();

        long res = 1; // Initialize result to 1 (x^0 = 1)

        for (int i = 1; i <= n; i++) { // Loop from 1 to n to calculate x^n
            res = res * x; // Multiply the result by x in each iteration to get x^n
        }

        System.out.println(x + "^" + n + " = " + res);
    }
    
}
