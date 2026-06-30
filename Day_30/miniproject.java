package Day_30;

import java.util.Scanner;

public class miniproject {
     static final int MAX_ENTRIES = 100; // Maximum number of expenses we can ever store.

    static String[] categories = new String[MAX_ENTRIES];
    static double[] amounts = new double[MAX_ENTRIES];
    static String[] descriptions = new String[MAX_ENTRIES];
    
    static int entryCount = 0; // This counter tells us how many expenses are CURRENTLY stored.

    // A single Scanner object shared across all methods that need input.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        boolean running = true; // controls our main while loop

        System.out.println("-------------------------------------------------");
        System.out.println("      WELCOME TO THE SMART BUDGET TRACKER");
        System.out.println("-------------------------------------------------");

        while (running) { // Main loop
                    
            displayMenu();                     // show the options
            int choice = readMenuChoice();      // get a valid integer choice

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    displayTotalSpending();
                    break;
                case 4:
                    generateAnalyticsReport();
                    break;
                case 5:
                    System.out.println("\nThank you for using Smart Budget Tracker. Goodbye!");
                    running = false; // this will end the while loop
                    break;
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 5.");
            }
        }

        sc.close();// Close scanner when program exits

    }
    static void displayMenu() {
        System.out.println("\n-------------------------------------------------");
        System.out.println("                 MAIN MENU                         ");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Add a new expense");
        System.out.println("2. View all expenses");
        System.out.println("3. Show total spending");
        System.out.println("4. Generate analytics report");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

   
    static int readMenuChoice() {
        String input = sc.nextLine().trim();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; // not a valid number
        }
    }

   
    static void addExpense() {

        // First check if our arrays are already full.
        if (entryCount >= MAX_ENTRIES) {
            System.out.println("\nStorage full! Cannot add more than " + MAX_ENTRIES + " expenses.");
            return;
        }

        System.out.println("\n--- Add New Expense ---");

        
        System.out.print("Enter category (e.g., Food, Rent, Fun): ");
        String rawCategory = sc.nextLine();
        String category = rawCategory.trim().toUpperCase();

        if (category.isEmpty()) {
            System.out.println("Category cannot be empty. Expense not added.");
            return;
        }

        
        double amount = readPositiveDouble("Enter amount spent: $");

        // Get a short description.
        System.out.print("Enter a short description: ");
        String description = sc.nextLine().trim();
        if (description.isEmpty()) {
            description = "(no description)";
        }

        if (isCategoryDuplicate(category)) {
            System.out.println("Note: \"" + category + "\" already exists. Adding another entry under it.");
        } else {
            System.out.println("Note: \"" + category + "\" is a new category.");
        }

        // Store the values into the parallel arrays at the same index.
        categories[entryCount] = category;
        amounts[entryCount] = amount;
        descriptions[entryCount] = description;

        // Move the counter forward so the next entry goes into the next slot.
        entryCount++;

        System.out.println("Expense added successfully! (" + entryCount + " total entries)");
    }

   
    static double readPositiveDouble(String prompt) {
        double value = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
                value = Double.parseDouble(input);
                if (value <= 0) {
                    System.out.println("Amount must be greater than 0. Try again.");
                } else {
                    validInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Try again.");
            }
        }
        return value;
    }

   
    static boolean isCategoryDuplicate(String newCategory) {
        // Loop through only the "used" portion of the array.
        for (int i = 0; i < entryCount; i++) {
           
            if (categories[i].equals(newCategory)) {
                return true; // found a match - it's a duplicate
            }
        }
        return false; // looped through everything, no match found
    }

    static void viewAllExpenses() {
        System.out.println("\n--- All Expenses ---");

        if (entryCount == 0) {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.printf("%-5s %-15s %-10s %-25s%n", "No.", "Category", "Amount", "Description");
        System.out.println("-------------------------------------------------------");

        
        for (int i = 0; i < entryCount; i++) {
            System.out.printf("%-5d %-15s $%-9.2f %-25s%n",
                    (i + 1), categories[i], amounts[i], descriptions[i]);
        }
    }

    static double calculateTotalSpending() {
        double total = 0.0;

        // Add up every amount from index 0 to entryCount - 1.
        for (int i = 0; i < entryCount; i++) {
            total += amounts[i];
        }

        return total;
    }

    //Displays the total spending to the user in a formatted way.
     
    static void displayTotalSpending() {
        System.out.println("\n--- Total Spending ---");

        if (entryCount == 0) {
            System.out.println("No expenses recorded yet. Total spending: $0.00");
            return;
        }

        double total = calculateTotalSpending();
        System.out.printf("Total amount spent across %d entries: $%.2f%n", entryCount, total);
    }

    static void generateAnalyticsReport() {
        System.out.println("\n=================================================");
        System.out.println("            BUDGET ANALYTICS REPORT");
        System.out.println("=================================================");

        if (entryCount == 0) {
            System.out.println("No data available. Add some expenses first!");
            return;
        }

        double grandTotal = calculateTotalSpending();


        String[] uniqueCategories = new String[MAX_ENTRIES];
        double[] categoryTotals = new double[MAX_ENTRIES];
        int uniqueCount = 0; // how many distinct categories we've found so far

        // Step 1: Build the grouped totals.
        for (int i = 0; i < entryCount; i++) {
            String currentCategory = categories[i];
            double currentAmount = amounts[i];

            int foundIndex = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueCategories[j].equals(currentCategory)) {
                    foundIndex = j;
                    break; // stop searching, we found it
                }
            }

            if (foundIndex == -1) {
               
                uniqueCategories[uniqueCount] = currentCategory;
                categoryTotals[uniqueCount] = currentAmount;
                uniqueCount++;
            } else {
                
                categoryTotals[foundIndex] += currentAmount;
            }
        }

        // Step 2: Print the report header.
        System.out.printf("Total entries recorded : %d%n", entryCount);
        System.out.printf("Unique categories found : %d%n", uniqueCount);
        System.out.printf("Grand total spending    : $%.2f%n", grandTotal);
        System.out.println("-------------------------------------------------");
        System.out.println("               CATEGORY BREAKDOWN                ");
        System.out.println("-------------------------------------------------");

        // Step 3: Print each category's totals and percentage.
        for (int i = 0; i < uniqueCount; i++) {
            double percentage = (categoryTotals[i] / grandTotal) * 100.0;

            System.out.printf("%s: $%.2f (%.1f%% of total spending)%n",
                    uniqueCategories[i], categoryTotals[i], percentage);
        }

        // Step 4: Find and highlight the highest-spending category.
        int highestIndex = 0;
        for (int i = 1; i < uniqueCount; i++) {
            if (categoryTotals[i] > categoryTotals[highestIndex]) {
                highestIndex = i;
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("Highest spending category: %s ($%.2f)%n",
                uniqueCategories[highestIndex], categoryTotals[highestIndex]);
        System.out.println("=================================================");
    }
}
  