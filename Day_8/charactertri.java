package Day_8;

import java.util.Scanner;

public class charactertri {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // outer loop to iterate through each row
        for (char ch = 'A'; ch < 'A' + i; ch++) { // inner loop to print characters in each row
                System.out.print(ch + " "); // print the current character followed by a space
            }
            System.out.println();
        }

        sc.close();
    }
    
}
