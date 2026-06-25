package Day_25;

import java.util.Scanner;

public class merge {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array = ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.print("Enter " + n1 + " elements of first array = ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array = ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.print("Enter " + n2 + " elements of second array = ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) { // compare elements
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) { // copy remaining elements
            merged[k++] = arr1[i++];
        }

        while (j < n2) { // copy remaining elements
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array = ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
    
}
