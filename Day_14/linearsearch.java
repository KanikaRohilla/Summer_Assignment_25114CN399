package Day_14;

import java.util.Scanner;

public class linearsearch {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { //loop to take input of array elements
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched = ");
        int key = sc.nextInt(); //element to be searched

        boolean found = false;

        for (int i = 0; i < n; i++) { //loop to search for the element in the array
            if (arr[i] == key) { //if element is found
                System.out.print("Element found at place " + (i+1)); //printing the place of the element
                found = true;
                break;
            }
        }

        if (!found) { //if element is not found
            System.out.println("Element not found");
        }

        sc.close();
    }
    
}
