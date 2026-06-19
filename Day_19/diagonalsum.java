package Day_19;

import java.util.Scanner;

public class diagonalsum {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix = "); // Input size
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.print("Enter " + (n*n) + " matrix elements = "); // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { // Add diagonal elements
            sum += matrix[i][i];
        }
        sc.close();

        System.out.println("Diagonal Sum Of Matrix = " + sum); // Display sum
    }
    
}
