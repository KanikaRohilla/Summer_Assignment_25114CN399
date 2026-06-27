package Day_27;

import java.util.Scanner;

public class studentrecord{
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        int[] age = new int[100];
        double[] marks = new double[100];

        int count = 0; // Stores total students
        int choice;

        do {

            System.out.println("\n----- Student Record Management System ------");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number = ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine(); // Clear buffer

                    System.out.print("Enter Name = ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Age = ");
                    age[count] = sc.nextInt();

                    System.out.print("Enter Marks = ");
                    marks[count] = sc.nextDouble();

                    count++; // Increase record count

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {

                        System.out.println("\nStudent Records");

                        for (int i = 0; i < count; i++) {

                            System.out.println("-------------------------");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Age     : " + age[i]);
                            System.out.println("Marks   : " + marks[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search = ");
                    int search = sc.nextInt();

                    boolean found = false; // Checks if student exists

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == search) {

                            System.out.println("\nStudent Found");
                            System.out.println("Roll No : " + rollNo[i]);
                            System.out.println("Name    : " + name[i]);
                            System.out.println("Age     : " + age[i]);
                            System.out.println("Marks   : " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll Number to Delete = ");
                    int delete = sc.nextInt();

                    boolean deleted = false; // Checks deletion

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == delete) {

                            for (int j = i; j < count - 1; j++) {

                                rollNo[j] = rollNo[j + 1];
                                name[j] = name[j + 1];
                                age[j] = age[j + 1];
                                marks[j] = marks[j + 1];
                            }

                            count--;
                            deleted = true;

                            System.out.println("Student deleted successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 5);

        sc.close();
    }
}