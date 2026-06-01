package Day_1;

import java.util.Scanner;

public class count {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, count = 0;

        System.out.print("Enter a number = ");
        n = s.nextInt();
        int q = n;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println("Number of digits in the number " + q + " is = " + count);
    }
}
    
