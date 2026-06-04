package Day_4;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms = ");
        int n = sc.nextInt();

        int a = 0, b = 1; // first two terms of the Fibonacci series

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");

            int c = a + b; // next term is the sum of the previous two terms
            a = b; // update a to the value of b
            b = c; // update b to the value of c (the next term)
        }

        sc.close();
    }
    
}
