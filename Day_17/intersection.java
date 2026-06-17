package Day_17;

import java.util.Scanner;

public class intersection {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array = ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1]; // Declare first array

        System.out.print("Enter " + n1 + " elements = ");
        for(int i = 0; i < n1; i++) { // Read first array
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array = ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2]; // Declare second array

        System.out.print("Enter " + n2 + " elements = ");
        for(int i = 0; i < n2; i++) { // Read second array
            arr2[i] = sc.nextInt();
        }

        boolean found = false; // Track intersection

        System.out.print("Intersection of arrays = ");

        for(int i = 0; i < n1; i++) { // Traverse first array
            for(int j = 0; j < n2; j++) { // Traverse second array

                if(arr1[i] == arr2[j]) { // Common element found
                    System.out.print(arr1[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if(!found) { // No intersection exists
            System.out.print("No intersection found");
        }

        sc.close();
    }
    
}
