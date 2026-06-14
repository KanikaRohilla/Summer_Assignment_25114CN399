package Day_14;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n]; //array to store the elements

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { //loop to take input of array elements
            arr[i] = sc.nextInt();
        }

        boolean found = false; //variable to check if duplicate elements are found or not

        for (int i = 0; i < n; i++) { //loop to find duplicate elements in the array
            for (int j = i + 1; j < n; j++) { //loop to compare the current element with the rest of the elements in the array
                if (arr[i] == arr[j]) { //if duplicate elements are found
                    if (!found) { //if duplicate elements are found for the first time, then print the message
                        System.out.print("Duplicate element in array : ");
                    }
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found");
        }

        sc.close();
    }
    
    
}
