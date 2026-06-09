package Day_9;

import java.util.Scanner;

public class hollowsq {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length of square = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outer loop to iterate through each row
            for (int j = 1; j <= n; j++) { // inner loop to iterate through each column in the current row

                if (i == 1 || i == n || j == 1 || j == n) { // condition to check if the current position is on the border of the square
                    System.out.print("* "); // print an asterisk followed by a space if the current position is on the border
                } else {
                    System.out.print("  "); // print two spaces if the current position is inside the square
                }
            }
            System.out.println(); // move to the next line after printing all columns in the current row
        }

        sc.close();
    }
    
}
