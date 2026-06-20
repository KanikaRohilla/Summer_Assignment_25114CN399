package Day_20;

import java.util.Scanner;

public class columnsum {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Taking input

        System.out.print("Enter rows and columns = ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.print("Enter matrix elements = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) { // Calculate each column sum
            int sum = 0;

            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
    
}
