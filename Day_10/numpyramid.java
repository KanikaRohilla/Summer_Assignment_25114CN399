package Day_10;

import java.util.Scanner;

public class numpyramid {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for each row

            for (int j = 1; j <= n - i; j++) { // Loop for spaces
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) { // Loop for numbers
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) { // Loop for numbers
                System.out.print(j + " ");
            }

            System.out.println();
        }
        sc.close();
    }
    
}
