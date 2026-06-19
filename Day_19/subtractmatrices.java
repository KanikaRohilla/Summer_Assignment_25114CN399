package Day_19;

import java.util.Scanner;

public class subtractmatrices {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows = "); // Input rows
        int rows = sc.nextInt();

        System.out.print("Enter columns = "); // Input columns
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] diff = new int[rows][cols];

        System.out.print("Enter first matrix = "); // Input first matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter second matrix = "); // Input second matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) { // Subtract matrices
            for (int j = 0; j < cols; j++) {
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Difference Of Matrices = ");
        for (int i = 0; i < rows; i++) { // Display result
            for (int j = 0; j < cols; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
