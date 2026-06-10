package Day_10;

import java.util.Scanner;

public class revstarpyramid {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) { // Loop for each row starting from n down to 1

            for (int j = 1; j <= n - i; j++) { // Loop for spaces, increasing the number of spaces as we go down the rows
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) { // Loop for stars, decreasing the number of stars as we go down the rows
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
