package Day_8;

import java.util.Scanner;

public class numbertri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outer loop to iterate through each row
        for (int j = 1; j <= i; j++) { // inner loop to print numbers in each row 
                System.out.print(j + " "); // print the current number followed by a space
            }
            System.out.println();
        }

        sc.close();
    }
    
}
