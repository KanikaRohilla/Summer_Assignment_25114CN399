package Day_1;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int n;
        long fact = 1;

        System.out.print("Enter a number = ");
        n = p.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    }
}
    

