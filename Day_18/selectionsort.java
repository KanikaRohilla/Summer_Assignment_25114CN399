package Day_18;

import java.util.Scanner;

public class selectionsort {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) { //selects the position where the smallest element should be placed
            int minIndex = i;

            for (int j = i + 1; j < n; j++) { //loop to find the index of minimum element
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.print("Sorted Array = ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
