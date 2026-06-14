package Day_14;

import java.util.Scanner;

public class secondlarge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { //loop to take input of array elements
            arr[i] = sc.nextInt();
        }

        int large = 0; //variable to store the largest element
        int seclarge = 0; //variable to store the second largest element

        for (int i = 0; i < n; i++) {//loop to find the largest and second largest element in the array
            if (arr[i] > large) {
                seclarge = large;
                large = arr[i];
            } else if (arr[i] > seclarge && arr[i] != large) { //if the current element is greater than second largest and not equal to largest
                seclarge = arr[i];
            }
        }

        System.out.println("Second Largest Element in the array = " + seclarge);

        sc.close();
    }
    
}
