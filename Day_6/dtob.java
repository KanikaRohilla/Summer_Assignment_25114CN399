package Day_6;

import java.util.Scanner;

public class dtob {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number = ");
        int num = sc.nextInt();
        int a = num;

        int bi = 0; // binary number
        int p = 1; // place value

        while (num > 0) {
            int rem = num % 2; // remainder (0 or 1)
            num = num / 2; // integer division by 2
            bi = bi + (rem * p); // add the remainder to the binary number at the correct place value
            p = p * 10; // update the place value for the next bit (multiply by 10 to shift left)
        }

        System.out.println("Binary of " + a + " = " + bi);
    }

}
