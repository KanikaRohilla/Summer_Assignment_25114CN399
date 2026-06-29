package Day_29;

import java.util.Scanner;

public class arrayoperation {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();

        int arr[] = new int[size]; // creates array

        System.out.println("Enter " + size + " elements = ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // stores elements
        }

        int choice;

        do {
            System.out.println("\n------ ARRAY OPERATIONS ------");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Calculate Sum");
            System.out.println("5. Calculate Average");
            System.out.println("6. Search an Element");
            System.out.println("7. Exit");

            System.out.print("Enter your choice = ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Array Elements = ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0]; // assumes first element is maximum

                    for (int i = 1; i < size; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }

                    System.out.println("Maximum Element = " + max);
                    break;

                case 3:
                    int min = arr[0]; // assumes first element is minimum

                    for (int i = 1; i < size; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }

                    System.out.println("Minimum Element = " + min);
                    break;

                case 4:
                    int sum = 0;

                    for (int i = 0; i < size; i++) {
                        sum = sum + arr[i]; // adds all elements
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    int total = 0;

                    for (int i = 0; i < size; i++) {
                        total = total + arr[i];
                    }

                    double average = (double) total / size; // calculates average

                    System.out.println("Average = " + average);
                    break;

                case 6:
                    System.out.print("Enter element to search = ");
                    int key = sc.nextInt();

                    boolean found = false; // checks if element exists

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 7:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7); // repeats until Exit is chosen

        sc.close(); // closes scanner
    }
    
}
