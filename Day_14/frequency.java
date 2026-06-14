package Day_14;

import java.util.Scanner;

public class frequency {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array = "); //taking size of array as input
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " array elements = ");
        for (int i = 0; i < n; i++) { //loop to take input of array elements
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element whose frequency is to be found = ");
        int key = sc.nextInt(); //element whose frequency is to be found

        int count = 0;

        for (int i = 0; i < n; i++) { //loop to count the frequency of the element in the array
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " = " + count);

        sc.close();
    }
    
}
