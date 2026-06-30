package Day_30;

import java.util.Scanner;

public class studentrecord {
      static Scanner sc = new Scanner(System.in); // Scanner object for input

    static int max = 100; // Maximum number of students
    static int[] rollNo = new int[max]; // Array to store roll numbers
    static String[] name = new String[max]; // Array to store names
    static String[] course = new String[max]; // Array to store courses

    static int count = 0; // Keeps track of total students

    public static void addStudent() {

        System.out.print("Enter Roll Number = ");
        rollNo[count] = sc.nextInt();
        sc.nextLine(); // Clear input buffer

        System.out.print("Enter Name = ");
        name[count] = sc.nextLine();

        System.out.print("Enter Course = ");
        course[count] = sc.nextLine();

        count++; // Increase student count

        System.out.println("Student Added Successfully.");
    }

    public static void displayStudents() {

        if (count == 0) {
            System.out.println("No Student Records Found.");
            return; // Exit method if no records
        }

        System.out.println("\n----- Student Records -----");

        for (int i = 0; i < count; i++) { // Display all students

            System.out.println("Roll Number : " + rollNo[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Course      : " + course[i]);
            System.out.println("---------------------------");
        }
    }

    public static void searchStudent() {

        System.out.print("Enter Roll Number to Search = ");
        int search = sc.nextInt();

        boolean found = false; // Check if student exists

        for (int i = 0; i < count; i++) {

            if (rollNo[i] == search) { // Compare roll numbers

                System.out.println("Student Found");
                System.out.println("Roll Number : " + rollNo[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Course      : " + course[i]);

                found = true;
                break; // Stop searching after finding student
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void deleteStudent() {

        System.out.print("Enter Roll Number to Delete = ");
        int delete = sc.nextInt();

        boolean found = false; // Check if record exists

        for (int i = 0; i < count; i++) {

            if (rollNo[i] == delete) {

                for (int j = i; j < count - 1; j++) { // Shift remaining records

                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    course[j] = course[j + 1];
                }

                count--; // Reduce total students
                found = true;

                System.out.println("Student Deleted Successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n----- Student Record System ----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(); // Call add method
                    break;

                case 2:
                    displayStudents(); // Call display method
                    break;

                case 3:
                    searchStudent(); // Call search method
                    break;

                case 4:
                    deleteStudent(); // Call delete method
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5); // Repeat until user selects Exit
    }
    
}
