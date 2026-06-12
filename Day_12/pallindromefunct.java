package Day_12;

import java.util.Scanner;

public class pallindromefunct {
    public static boolean Palindrome(int num) { //function to check if the number is a palindrome or not
        int og = num; //original number to compare with the reversed number
        int rev = 0; //variable to store the reversed number

        while (num > 0) { //loop to reverse the number
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return og == rev;//return true if the original number is equal to the reversed number, otherwise return false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        int og = num;

        if (Palindrome(num)) {//if the number is a palindrome, print that it is a palindrome number
            System.out.println(og + " is a Palindrome Number");
        } else {
            System.out.println(og + " is not a Palindrome Number");
        }

        sc.close();
    }
    
}
