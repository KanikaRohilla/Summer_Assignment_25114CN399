package Day_28;

import java.util.Scanner;

public class contactmanage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] contacts = new String[5]; // Store contact names
        String[] number = new String[5]; //store contact number
        int count = 0;
        int choice;

        do {

            System.out.println("\n----- Contact Management System -----");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < contacts.length) {
                        System.out.print("Enter Contact Name = ");
                        contacts[count] = sc.nextLine();
                        System.out.print("Enter Contact Number = ");
                        number[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List is Full.");
                    }
                    break;

                case 2:
                    System.out.println("\nContact List = ");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + contacts[i] + ", "+ number[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search = ");
                    String name = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (contacts[i].equalsIgnoreCase(name)) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Contact Found.");
                    } else {
                        System.out.println("Contact Not Found.");
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
