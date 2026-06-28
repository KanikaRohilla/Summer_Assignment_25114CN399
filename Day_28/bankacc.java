package Day_28;

import java.util.Scanner;

public class bankacc {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000; // Initial balance
        int choice;

        do {

            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: Rs." + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit = ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Money Deposited Successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw = ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Money Withdrawn Successfully.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
    
}
