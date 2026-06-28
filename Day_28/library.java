package Day_28;

import java.util.Scanner;

public class library {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++"}; // Available books
        boolean[] issued = {false, false, false};   // Book issue status

        int choice;

        do {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Books = ");
                    for (int i = 0; i < books.length; i++) {
                        if (!issued[i]) {
                            System.out.println((i + 1) + ". " + books[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter book number to issue = ");
                    int issue = sc.nextInt() - 1;

                    if (issue >= 0 && issue < books.length && !issued[issue]) {
                        issued[issue] = true;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to return = ");
                    int ret = sc.nextInt() - 1;

                    if (ret >= 0 && ret < books.length && issued[ret]) {
                        issued[ret] = false;
                        System.out.println("Book Returned Successfully.");
                    } else {
                        System.out.println("Invalid Book.");
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
