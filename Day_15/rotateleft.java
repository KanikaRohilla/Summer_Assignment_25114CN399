package Day_15;

import java.util.Scanner;

public class rotateleft {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " array elements = ");
        for(int i = 0; i < n; i++) { // Loop to read n elements into the array
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations = ");
        int k = sc.nextInt();

        k = k % n; // Handle cases where rotation is greater than size of array

        for(int r = 0; r < k; r++) { // Loop to perform k left rotations
            int first = arr[0];

            for(int i = 0; i < n - 1; i++) { // Loop to shift elements to the left
                arr[i] = arr[i + 1]; // Shift the next element to the current position
            }

            arr[n - 1] = first; // Place the first element at the end of the array after shifting
        }

        System.out.print("Array after " + k + " left rotation =");
        for(int num : arr) { // Loop to print the rotated array
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
