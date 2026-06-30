package Day_30;

import java.util.Scanner;

public class minilibrary {
     static Scanner sc = new Scanner(System.in); // Scanner object

    static int max = 100; // Maximum books
    static int[] bookId = new int[max]; // Store book IDs
    static String[] bookName = new String[max]; // Store book names
    static String[] author = new String[max]; // Store author names
    static boolean[] issued = new boolean[max]; // Issue status

    static int count = 0; // Total books

    public static void addBook() {

        System.out.print("Enter Book ID = ");
        bookId[count] = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Book Name = ");
        bookName[count] = sc.nextLine();

        System.out.print("Enter Author Name = ");
        author[count] = sc.nextLine();

        issued[count] = false; // Book is available

        count++; // Increase book count

        System.out.println("Book Added Successfully.");
    }

    public static void displayBooks() {

        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\n===== Library Books =====");

        for (int i = 0; i < count; i++) {

            System.out.println("Book ID = " + bookId[i]);
            System.out.println("Book Name = " + bookName[i]);
            System.out.println("Author = " + author[i]);

            if (issued[i]) {
                System.out.println("Status = Issued");
            } else {
                System.out.println("Status = Available");
            }

            System.out.println("---------------------------");
        }
    }

    public static void searchBook() {

        System.out.print("Enter Book ID to Search = ");
        int search = sc.nextInt();

        boolean found = false; // Check book exists

        for (int i = 0; i < count; i++) {

            if (bookId[i] == search) {

                System.out.println("Book Found");
                System.out.println("Book ID = " + bookId[i]);
                System.out.println("Book Name = " + bookName[i]);
                System.out.println("Author = " + author[i]);

                if (issued[i]) {
                    System.out.println("Status = Issued");
                } else {
                    System.out.println("Status = Available");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    public static void issueBook() {

        System.out.print("Enter Book ID to Issue = ");
        int issue = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == issue) {

                if (!issued[i]) {

                    issued[i] = true; // Issue book
                    System.out.println("Book Issued Successfully.");

                } else {

                    System.out.println("Book Already Issued.");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    public static void returnBook() {

        System.out.print("Enter Book ID to Return = ");
        int ret = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == ret) {

                if (issued[i]) {

                    issued[i] = false; // Return book
                    System.out.println("Book Returned Successfully.");

                } else {

                    System.out.println("Book is Already Available.");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    public static void deleteBook() {

        System.out.print("Enter Book ID to Delete = ");
        int delete = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (bookId[i] == delete) {

                for (int j = i; j < count - 1; j++) { // Shift records

                    bookId[j] = bookId[j + 1];
                    bookName[j] = bookName[j + 1];
                    author[j] = author[j + 1];
                    issued[j] = issued[j + 1];
                }

                count--; // Reduce count

                System.out.println("Book Deleted Successfully.");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n----- Mini Library Management System ----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");

            System.out.print("Enter Your Choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook(); // Add new book
                    break;

                case 2:
                    displayBooks(); // Display all books
                    break;

                case 3:
                    searchBook(); // Search by ID
                    break;

                case 4:
                    issueBook(); // Issue a book
                    break;

                case 5:
                    returnBook(); // Return a book
                    break;

                case 6:
                    deleteBook(); // Delete a book
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7); // Repeat until Exit

        sc.close();
    }
    
}
