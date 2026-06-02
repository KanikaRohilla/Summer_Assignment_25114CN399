package Day_2;

import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {

        Scanner w = new Scanner(System.in); //to take input from the user

        System.out.print("Enter a number: ");
        int num = w.nextInt();

        int rev = 0; //to store the reversed number

        while (num > 0) {
            int d = num % 10; //to get the last digit of the number
            rev = rev * 10 + d; 
            num = num / 10; //to remove the last digit from the number
        }

        System.out.println("Reversed number = " + rev);
    }
    
}
