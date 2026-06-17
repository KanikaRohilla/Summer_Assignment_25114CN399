package Day_17;

import java.util.Scanner;

public class union {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array = ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1]; // Declare first array

        System.out.print("Enter " + n1 + " elements = ");
        for(int i = 0; i < n1; i++) { // Read first array
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array = ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2]; // Declare second array

        System.out.print("Enter " + n2 + " elements = ");
        for(int i = 0; i < n2; i++) { // Read second array
            arr2[i] = sc.nextInt();
        }

        System.out.print("Union = ");

        for(int i = 0; i < n1; i++) { // Print first array
            System.out.print(arr1[i] + " ");
        }

        for(int i = 0; i < n2; i++) { // Check second array elements

            boolean found = false; // Track duplicate element

            for(int j = 0; j < n1; j++) { // Search in first array
                if(arr2[i] == arr1[j]) {
                    found = true; // Duplicate found
                    break;
                }
            }

            if(!found) { // Print unique element
                System.out.print(arr2[i] + " ");
            }
        }

        sc.close();
    }
    
}
