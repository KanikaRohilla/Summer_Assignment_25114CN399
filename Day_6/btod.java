package Day_6;

import java.util.Scanner;

public class btod {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number = ");
        int bi = sc.nextInt();

        int temp = bi; // to store the original binary number for printing

        int dec = 0; // to store the decimal value
        int p = 1;

        while (bi > 0) {
            int digit = bi % 10; // to get the last digit

            dec = dec + (digit * p); // to add the value of the digit to the decimal number

            p = p * 2; // to update the power of 2 for the next digit

            bi = bi / 10;// to remove the last digit from the binary number
        }

        System.out.println("Decimal of " + temp + " = " + dec);
    }
    
}
