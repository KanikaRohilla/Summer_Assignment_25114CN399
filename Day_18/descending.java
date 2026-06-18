package Day_18;

import java.util.Scanner;

public class descending {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements = ");
        for (int i = 0; i < n; i++) { //loop to read elements of array
            arr[i] = sc.nextInt();
        }

        // Descending Order
        for (int i = 0; i < n - 1; i++) { //select element to compare with remaining elements
            for (int j = i + 1; j < n; j++) { //checks all elements after the current position
                if (arr[i] < arr[j]) { //swaps elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
    
}
