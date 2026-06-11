package Day_11 ;

import java.util.Scanner;   

public class sumfunct {
    static int Sum(int a, int b) { // Function to calculate the sum of two numbers
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number = ");
        int num2 = sc.nextInt();

        int sum = Sum(num1, num2); // Calling the Sum function to calculate the sum of num1 and num2

        System.out.println("Sum of " + num1 + " and " + num2 + " = " + sum);

        sc.close();
    }
    
}
