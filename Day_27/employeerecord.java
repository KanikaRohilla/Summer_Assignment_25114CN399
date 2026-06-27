package Day_27;

import java.util.Scanner;

public class employeerecord {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        String[] department = new String[100];
        double[] salary = new double[100];

        int count = 0; // Stores total employees
        int choice;

        do {

            System.out.println("\n----- Employee Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

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

                    System.out.println("Employee added successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {

                        System.out.println("\nEmployee Records");

                        for (int i = 0; i < count; i++) {

                            System.out.println("----------------------------");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Salary      : " + salary[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search = ");
                    int search = sc.nextInt();

                    boolean found = false; // Checks employee

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == search) {

                            System.out.println("\nEmployee Found");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Department  : " + department[i]);
                            System.out.println("Salary      : " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Delete = ");
                    int delete = sc.nextInt();

                    boolean deleted = false; // Checks deletion

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == delete) {

                            for (int j = i; j < count - 1; j++) {

                                empId[j] = empId[j + 1];
                                empName[j] = empName[j + 1];
                                department[j] = department[j + 1];
                                salary[j] = salary[j + 1];
                            }

                            count--;

                            deleted = true;

                            System.out.println("Employee deleted successfully.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Employee not found.");
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
    

