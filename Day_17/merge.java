package Day_17;

import java.util.Scanner;

public class merge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array = ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1]; // Declare first array

        System.out.print("Enter " + n1 + " elements = ");
        for(int i = 0; i < n1; i++) { // Read first array elements
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array = ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2]; // Declare second array

        System.out.print("Enter " + n2 + " elements = ");
        for(int i = 0; i < n2; i++) { // Read second array elements
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2]; // Create merged array

        for(int i = 0; i < n1; i++) { // Copy first array
            merged[i] = arr1[i];
        }

        for(int i = 0; i < n2; i++) { // Copy second array
            merged[n1 + i] = arr2[i];
        }

        System.out.print("Merged array = ");
        for(int num : merged) { // Print merged array
            System.out.print(num + " ");
        }

        sc.close();
    }
    
}
