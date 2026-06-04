package Day_4;

import java.util.Scanner;

public class nthfib {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0; // first two terms of the Fibonacci series and a variable to store the next term

        if (n == 1) {
            System.out.println("Nth Fibonacci term = 0"); // the first term of the Fibonacci series is 0
        } else if (n == 2) {
            System.out.println("Nth Fibonacci term = 1"); // the second term of the Fibonacci series is 1
        } else {
            for (int i = 3; i <= n; i++) { // calculate the Fibonacci term iteratively starting from the third term
                c = a + b;
                a = b;
                b = c;
            }
        

            System.out.println(n +"th Fibonacci term = " + c);
        }

        sc.close();
    }
    
}
