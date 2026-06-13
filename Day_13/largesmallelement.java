package Day_13;

import java.util.Scanner;

public class largesmallelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare an array of size n

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { // Loop to read array elements
            arr[i] = sc.nextInt();
        }

        int large = arr[0]; // Initialize largest element to the first element of the array
        int small = arr[0]; // Initialize smallest element to the first element of the array

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i]; // Update largest element if current element is greater
            }

            if (arr[i] < small) {
                small = arr[i]; // Update smallest element if current element is smaller
            }
        }

        System.out.println("Largest element in the array = " + large);
        System.out.println("Smallest element in the array = " + small);

        sc.close();
    }
    
}
