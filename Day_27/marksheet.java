package Day_27;

import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        double[] total = new double[100];
        double[] percentage = new double[100];
        String[] grade = new String[100];

        int count = 0; // Stores total students
        int choice;

        do {

            System.out.println("\n------ Marksheet Generation System -------");
            System.out.println("1. Add Student Marksheet");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Marksheet");
            System.out.println("4. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number = ");
                    rollNo[count] = sc.nextInt();

                    sc.nextLine(); // Clear buffer

                    System.out.print("Enter Student Name = ");
                    name[count] = sc.nextLine();

                    double sum = 0; // Stores total marks

                    for (int i = 1; i <= 5; i++) {

                        System.out.print("Enter Marks of Subject " + i + " = ");
                        sum += sc.nextDouble();
                    }

                    total[count] = sum;
                    percentage[count] = sum / 5;

                    // Decide grade

                    if (percentage[count] >= 90) {
                        grade[count] = "A+";
                    } else if (percentage[count] >= 80) {
                        grade[count] = "A";
                    } else if (percentage[count] >= 70) {
                        grade[count] = "B";
                    } else if (percentage[count] >= 60) {
                        grade[count] = "C";
                    } else if (percentage[count] >= 40) {
                        grade[count] = "D";
                    } else {
                        grade[count] = "Fail";
                    }

                    count++; // Increase student count

                    System.out.println("Marksheet generated successfully.");
                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No marksheets found.");

                    } else {

                        for (int i = 0; i < count; i++) {

                            System.out.println("\n-----------------------------");
                            System.out.println("Roll Number : " + rollNo[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Total Marks : " + total[i]);
                            System.out.println("Percentage  : " + percentage[i] + "%");
                            System.out.println("Grade       : " + grade[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search = ");
                    int search = sc.nextInt();

                    boolean found = false; // Checks student

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == search) {

                            System.out.println("\nStudent Marksheet");
                            System.out.println("Roll Number : " + rollNo[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("Total Marks : " + total[i]);
                            System.out.println("Percentage  : " + percentage[i] + "%");
                            System.out.println("Grade       : " + grade[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Student not found.");
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
