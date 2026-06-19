package Day_19;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows = "); // Input rows
        int rows = sc.nextInt();

        System.out.print("Enter columns = "); // Input columns
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.print("Enter matrix elements = "); // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix = ");
        for (int i = 0; i < cols; i++) { // Print transpose rows become columns and colums become rows
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
