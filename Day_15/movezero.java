package Day_15;

import java.util.Scanner;

public class movezero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Declare an array of size n

        System.out.print("Enter " + n + " array elements = ");
        for(int i = 0; i < n; i++) { // Loop to read n elements into the array
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for(int i = 0; i < n; i++) { // Loop through the array to move non-zero elements to the front
            if(arr[i] != 0) { // If the current element is not zero, move it to the index position
                arr[index] = arr[i]; // Move the non-zero element to the index position
                index++; // Increment the index to point to the next position for non-zero elements
            }
        }

        while(index < n) { // Loop to fill the remaining positions in the array with zeroes
            arr[index] = 0; // Set the current index position to zero
            index++; // Increment the index to move to the next position
        }

        System.out.print("Array after moving zeroes to end = ");
        for(int num : arr) { // Loop to print the modified array
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}
