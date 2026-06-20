package Day_20;

import java.util.Scanner;

public class multiplymatrices {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter rows and columns of first matrix = ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        
        System.out.print("Enter rows and columns of second matrix = ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) { //check if multiplication is possible
            System.out.println("Matrix multiplication not possible.");
            sc.close();
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        
        System.out.print("Enter first matrix elements = ");
        for (int i = 0; i < r1; i++) { //read elements of first matrix
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

       
        System.out.print("Enter second matrix elements = ");
        for (int i = 0; i < r2; i++) { //read elements of second matrix
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < r1; i++) { //multiply matrices and store result
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result Matrix = ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
