package Day_27;

import java.util.Scanner;

public class salarymanage {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empId = new int[100];
        String[] empName = new String[100];
        double[] basicSalary = new double[100];
        double[] hra = new double[100];
        double[] da = new double[100];
        double[] tax = new double[100];
        double[] netSalary = new double[100];

        int count = 0; // Stores total employees
        int choice;

        do {

            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Search Employee Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID = ");
                    empId[count] = sc.nextInt();

                    sc.nextLine(); // Clear input buffer

                    System.out.print("Enter Employee Name = ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary = ");
                    basicSalary[count] = sc.nextDouble();

                    hra[count] = basicSalary[count] * 0.20; // 20% HRA
                    da[count] = basicSalary[count] * 0.10; // 10% DA
                    tax[count] = basicSalary[count] * 0.05; // 5% Tax

                    netSalary[count] = basicSalary[count] + hra[count] + da[count] - tax[count];

                    count++; // Increase record count

                    System.out.println("Salary record added successfully.");
                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No salary records found.");

                    } else {

                        System.out.println("\nSalary Records");

                        for (int i = 0; i < count; i++) {

                            System.out.println("----------------------------------");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("HRA         : " + hra[i]);
                            System.out.println("DA          : " + da[i]);
                            System.out.println("Tax         : " + tax[i]);
                            System.out.println("Net Salary  : " + netSalary[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search = ");
                    int search = sc.nextInt();

                    boolean found = false; // Checks employee

                    for (int i = 0; i < count; i++) {

                        if (empId[i] == search) {

                            System.out.println("\nEmployee Salary Details");
                            System.out.println("Employee ID : " + empId[i]);
                            System.out.println("Name        : " + empName[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("HRA         : " + hra[i]);
                            System.out.println("DA          : " + da[i]);
                            System.out.println("Tax         : " + tax[i]);
                            System.out.println("Net Salary  : " + netSalary[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {

                        System.out.println("Employee not found.");
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
