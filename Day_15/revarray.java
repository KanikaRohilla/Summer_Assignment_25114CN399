package Day_15;

import java.util.Scanner;

public class revarray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Declare an array of size n

        System.out.print("Enter " + n + " array elements = ");
        for(int i = 0; i < n; i++) { // Loop to read n elements into the array
            arr[i] = sc.nextInt();
        }

        int start = 0; // Initialize start pointer to the beginning of the array
        int end = n - 1; // Initialize end pointer to the last index of the array

        while(start < end) { // Loop until the start pointer is less than the end pointer
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; // Move the start pointer to the right
            end--; // Move the end pointer to the left
        }

        System.out.print("Reversed array = ");
        for(int num : arr) { // Loop to print the reversed array
            System.out.print(num + " ");
        }
        sc.close();
    }
}
