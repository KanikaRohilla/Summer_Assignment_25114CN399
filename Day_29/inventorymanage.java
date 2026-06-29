package Day_29;

import java.util.Scanner;


class Item {
    int id;
    String name;
    int quantity;
    double price;
}

public class inventorymanage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[10]; // stores maximum 10 items

        for (int i = 0; i < 10; i++) {
            items[i] = new Item(); // creates objects
        }

        int count = 0; // keeps track of total items
        int choice;

        do {

            System.out.println("\n------ INVENTORY MANAGEMENT SYSTEM ------");
            System.out.println("1. Add Item");
            System.out.println("2. Display Items");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == 10) { // checks if inventory is full
                        System.out.println("Inventory is Full.");
                        break;
                    }

                    System.out.print("Enter Item ID = ");
                    items[count].id = sc.nextInt();

                    sc.nextLine(); // clears buffer

                    System.out.print("Enter Item Name = ");
                    items[count].name = sc.nextLine();

                    System.out.print("Enter Quantity = ");
                    items[count].quantity = sc.nextInt();

                    System.out.print("Enter Price = ");
                    items[count].price = sc.nextDouble();

                    count++; // increases item count

                    System.out.println("Item Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Items Available.");
                    } else {

                        System.out.println("\nItem Details");

                        for (int i = 0; i < count; i++) {

                            System.out.println("-----------------------");
                            System.out.println("Item ID : " + items[i].id);
                            System.out.println("Item Name : " + items[i].name);
                            System.out.println("Quantity : " + items[i].quantity);
                            System.out.println("Price : " + items[i].price);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Item ID to Update = ");
                    int searchId = sc.nextInt();

                    boolean found = false; // checks whether item exists

                    for (int i = 0; i < count; i++) {

                        if (items[i].id == searchId) {

                            System.out.print("Enter New Quantity = ");
                            items[i].quantity = sc.nextInt();

                            System.out.println("Quantity Updated Successfully.");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item Not Found.");
                    }

                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}    