package Day_9;

import java.util.Scanner;

public class revstar {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) { // outer loop to iterate through each row in reverse order
            for (int j = 1; j <= i; j++) { // inner loop to print stars in each row
                System.out.print("* "); // print a star with a space
            }
            System.out.println();
        }

        sc.close();
    }
    
}
