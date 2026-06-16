package Day_16;

import java.util.Scanner;

public class pairwithsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt(); 

        int arr[] = new int[n]; // Array size is n because we are going to read n elements

        System.out.print("Enter " + n + " elements = ");
        for (int i = 0; i < n; i++) { // Read each element of the array
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum = ");
        int sum = sc.nextInt();

        boolean found = false; // Variable to track if a pair with the given sum is found

        for (int i = 0; i < n; i++) { // Loop through each element of the array to find pairs
            for (int j = i + 1; j < n; j++) { // Loop through the remaining elements to check if the sum of the current pair equals the target sum
                if (arr[i] + arr[j] == sum) { // If a pair is found, print the pair and set found to true
                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) { // If no pair is found after checking all pairs, print a message indicating that no pair was found
            System.out.println("No pair found");
        }
        sc.close();
    }
    
}
