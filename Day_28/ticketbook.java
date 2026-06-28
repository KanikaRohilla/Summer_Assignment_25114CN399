package Day_28;

import java.util.Scanner;

public class ticketbook {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seats = 5; // Total seats
        int choice;

        do {

            System.out.println("\n----- Ticket Booking System ------");
            System.out.println("1. Check Available Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Seats = " + seats);
                    break;

                case 2:
                    if (seats > 0) {
                        seats--;
                        System.out.println("Ticket Booked Successfully.");
                    } else {
                        System.out.println("No Seats Available.");
                    }
                    break;

                case 3:
                    seats++;
                    System.out.println("Ticket Cancelled Successfully.");
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
