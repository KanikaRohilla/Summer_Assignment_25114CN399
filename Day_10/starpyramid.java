package Day_10;

import java.util.Scanner;

public class starpyramid {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = o.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for each row

            for (int j = 1; j <= n - i; j++) { // Loop for spaces
                System.out.print("  "); // Print space
            }

            for (int j = 1; j <= (2 * i - 1); j++) { // Loop for stars
                System.out.print("* "); // Print star
            }

            System.out.println();
        }
        o.close();
    }
    
}
