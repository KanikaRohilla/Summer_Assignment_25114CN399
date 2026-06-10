package Day_10;

import java.util.Scanner;

public class characterpyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for each row

            for (int j = 1; j <= n - i; j++) { // Loop for spaces, increasing the number of spaces as we go down the rows
                System.out.print("  ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) { // Loop for characters, increasing the character from 'A' to 'A' + i - 1 as we go down the rows
                System.out.print(ch + " ");
            }

            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) { // Loop for characters, decreasing the character from 'A' + i - 2 down to 'A' as we go down the rows
                System.out.print(ch + " ");
            }

            System.out.println();
        }
        sc.close();
    }
    
}
