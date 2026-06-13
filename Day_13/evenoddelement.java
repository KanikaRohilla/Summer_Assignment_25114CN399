package Day_13;

import java.util.Scanner;

public class evenoddelement {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare an array of size n
        int even = 0; // Variable to count even elements
        int odd = 0; // Variable to count odd elements

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { // Loop to read array elements
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) { // Check if the element is even
                even++;
            } else { // If the element is not even, it is odd
                odd++;
            }
        }

        System.out.println("Number of even elements in the array = " + even);
        System.out.println("Number of odd elements in the array = " + odd);

        sc.close();
    }
    
}
