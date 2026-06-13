package Day_13;

import java.util.Scanner;

public class arraydisplay {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt(); // Size of array

        int[] arr = new int[n];

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { // Loop to read array elements
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) { // Loop to display array elements
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
