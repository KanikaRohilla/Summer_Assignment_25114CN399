package Day_18;

import java.util.Scanner;

public class bubblesort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n +  " elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) { //passes
            for (int j = 0; j < n - i - 1; j++) { //swaps
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array = ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
