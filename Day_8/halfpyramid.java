package Day_8;

import java.util.Scanner;

public class halfpyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println();
        }

        sc.close();
    }
    
}
