package Day_29;

import java.util.Scanner;

public class menucalc {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice; // stores user's menu choice
        double num1, num2, result;

        do {
            System.out.println("\n----- CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number = ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number = ");
                    num2 = sc.nextDouble();

                    result = num1 + num2; // adds two numbers
                    System.out.println("Answer = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number = ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number = ");
                    num2 = sc.nextDouble();

                    result = num1 - num2; // subtracts two numbers
                    System.out.println("Answer = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number = ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number = ");
                    num2 = sc.nextDouble();

                    result = num1 * num2; // multiplies two numbers
                    System.out.println("Answer = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number = ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number = ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) { // checks division by zero
                        result = num1 / num2;
                        System.out.println("Answer = " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5); // repeats until user chooses Exit

        sc.close(); // closes scanner
    }
    
}
