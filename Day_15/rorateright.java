package Day_15;

import java.util.Scanner;

public class rorateright {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Declare an array of size n

        System.out.print("Enter " + n + " array elements = ");
        for(int i = 0; i < n; i++) { // Loop to read n elements into the array
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations = ");
        int k = sc.nextInt();

        k = k % n; // Handle cases where rotation is greater than size of array

        for(int r = 0; r < k; r++) {// Loop to perform k right rotations
            int last = arr[n - 1]; // Store the last element of the array

            for(int i = n - 1; i > 0; i--) { // Loop to shift elements to the right
                arr[i] = arr[i - 1]; // Shift the previous element to the current position
            }

            arr[0] = last; // Place the last element at the beginning of the array after shifting

        }

        System.out.print("Array after " + k + " right rotation = ");
        for(int num : arr) { // Loop to print the rotated array
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
