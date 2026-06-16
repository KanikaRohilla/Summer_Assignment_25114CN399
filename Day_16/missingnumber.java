package Day_16;

import java.util.Scanner;

public class missingnumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int arr[] = new int[n - 1]; // Array size is n-1 because one number is missing

        System.out.print("Enter " + (n - 1) + " elements = ");

        int arraySum = 0; // Variable to store the sum of the array elements

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array

            if (arr[i] < 1 || arr[i] > n) { // Validate input to ensure numbers are between 1 and n
                System.out.println("Invalid input! Numbers must be between 1 and " + n);
                return;
            }

            arraySum += arr[i]; // Add the current element to the array sum
        }
        sc.close(); 

        int total = n * (n + 1) / 2; // Calculate the total sum of numbers from 1 to n using the formula n(n+1)/2
        int miss = total - arraySum; // The missing number is the difference between the total sum and the sum of the array elements

        System.out.print("Missing number in the array = " + miss);

         
    }
    
}
