package Day_6;

import java.util.Scanner;

public class setbits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int temp = num; // Store the original number for later use

        int count = 0; // Initialize count of set bits

        while (num > 0) { // Loop until all bits are processed
            count += num & 1; // Increment count if the least significant bit is set
            num = num >> 1; // Right shift the bits to process the next bit in the next iteration
        }

        System.out.println("Number of set bits in " + temp + " = " + count);
    }
    
}
