package Day_8;

import java.util.Scanner;

public class repeatnumtri {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outer loop to iterate through each row
            for (int j = 1; j <= i; j++) { // inner loop to print the required number of stars in each row (j <= i means that the number of stars increases with each row)
                System.out.print(i + " "); // print the row number followed by a space without moving to the next line
            }
            System.out.println(); // move to the next line after printing all numbers in the current row
        }

        sc.close();
    }
    
}
