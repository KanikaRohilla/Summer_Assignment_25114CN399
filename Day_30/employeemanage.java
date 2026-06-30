package Day_30;

import java.util.Scanner;

public class employeemanage {
     static Scanner sc = new Scanner(System.in); // Scanner object

    static int max = 100; // Maximum employees

    static int[] empId = new int[max]; // Store employee IDs
    static String[] empName = new String[max]; // Store employee names
    static String[] department = new String[max]; // Store departments
    static double[] salary = new double[max]; // Store salaries

    static int count = 0; // Total employees

    public static void addEmployee() {

        System.out.print("Enter Employee ID = ");
        empId[count] = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("Enter Employee Name = ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department = ");
        department[count] = sc.nextLine();

        System.out.print("Enter Salary = ");
        salary[count] = sc.nextDouble();

        count++; // Increase employee count

        System.out.println("Employee Added Successfully.");
    }

    public static void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n===== Employee Records =====");

        for (int i = 0; i < count; i++) {

            System.out.println("Employee ID = " + empId[i]);
            System.out.println("Employee Name = " + empName[i]);
            System.out.println("Department = " + department[i]);
            System.out.println("Salary = " + salary[i]);
            System.out.println("----------------------------");
        }
    }

    public static void searchEmployee() {

        System.out.print("Enter Employee ID to Search = ");
        int search = sc.nextInt();

        boolean found = false; // Check employee exists

        for (int i = 0; i < count; i++) {

            if (empId[i] == search) {

                System.out.println("Employee Found");
                System.out.println("Employee ID = " + empId[i]);
                System.out.println("Employee Name = " + empName[i]);
                System.out.println("Department = " + department[i]);
                System.out.println("Salary = " + salary[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found.");
        }
    }

    public static void updateSalary() {

        System.out.print("Enter Employee ID = ");
        int update = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empId[i] == update) {

                System.out.print("Enter New Salary = ");
                salary[i] = sc.nextDouble(); // Update salary

                System.out.println("Salary Updated Successfully.");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found.");
        }
    }

    public static void deleteEmployee() {

        System.out.print("Enter Employee ID to Delete = ");
        int delete = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (empId[i] == delete) {

                for (int j = i; j < count - 1; j++) { // Shift records

                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];
                }

                count--; // Reduce employee count

                System.out.println("Employee Deleted Successfully.");

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(); // Add employee
                    break;

                case 2:
                    displayEmployees(); // Display employees
                    break;

                case 3:
                    searchEmployee(); // Search employee
                    break;

                case 4:
                    updateSalary(); // Update salary
                    break;

                case 5:
                    deleteEmployee(); // Delete employee
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6); // Repeat until Exit

        sc.close();
    }
    
}
