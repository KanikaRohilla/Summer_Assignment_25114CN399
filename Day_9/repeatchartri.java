package Day_9;

import java.util.Scanner;

public class repeatchartri {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outer loop to iterate through each row
            char ch = (char)('A' + i - 1); // calculate the character to be printed based on the current row number

            for (int j = 1; j <= i; j++) { // inner loop to print characters in each row
                System.out.print(ch + " "); // print the current character followed by a space
            }
            System.out.println();
        }

        sc.close();
    }
    
}
