package Day_13;

import java.util.Scanner;

public class sumandavg {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt(); // Size of array

        int[] arr = new int[n]; // Declare an array of size n
        int sum = 0; // Variable to store the sum of array elements

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { // Loop to read array elements
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n; // Calculate average of array elements

        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + avg);
        sc.close();
    }
    
}
