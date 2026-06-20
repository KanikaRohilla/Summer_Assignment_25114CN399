package Day_20;

import java.util.Scanner;

public class symmetric {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Taking input

        System.out.print("Enter size of square matrix = ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.print("Enter " + (n*n) + " matrix elements = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true; // Assume symmetric

        for (int i = 0; i < n; i++) { // Compare with transpose
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is Not Symmetric");
        }

        sc.close();
    }
    
}
