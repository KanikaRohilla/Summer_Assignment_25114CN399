package Day_18;

import java.util.Scanner;

public class binarysearch {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements in sorted order = ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search = ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) { 
            int mid = (low + high) / 2; //to find the middle element of current search range

            if (arr[mid] == key) {
                System.out.print("Element found at position = " + (mid+1));
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1; //searches in right half
            } else {
                high = mid - 1; //searches in left half
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
    
}
