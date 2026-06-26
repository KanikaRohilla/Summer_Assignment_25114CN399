package Day_26;

import java.util.Scanner;

public class Atm {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000; // Initial balance
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount = ");
                    int deposit = sc.nextInt();
                    balance += deposit; // Add money
                    System.out.println("Money Deposited Successfully.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount = ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance -= withdraw; // Deduct money
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
    
}
