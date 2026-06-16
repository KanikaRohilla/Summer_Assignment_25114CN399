package Day_16;

import java.util.Scanner;

public class maxfreq {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int arr[] = new int[n]; // Array size is n because we are going to read n elements

        System.out.print("Enter " + n + " elements = ");
        for (int i = 0; i < n; i++) { // Read each element of the array
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0; // Variable to store the maximum frequency of any element in the array
        int element = arr[0]; // Variable to store the element with the maximum frequency, initialized to the first element of the array

        for (int i = 0; i < n; i++) { // Loop through each element of the array to count its frequency
            int count = 1;

            for (int j = i + 1; j < n; j++) { // Loop through the remaining elements to count how many times the current element appears
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) { // If the count of the current element is greater than the maximum frequency found so far, update maxFreq and element
                maxFreq = count;
                element = arr[i];
            }
        }
        sc.close();

        System.out.println("Maximum frequency element = " + element);
        System.out.println("Frequency of " + element + " = " + maxFreq);
    }
    
}
