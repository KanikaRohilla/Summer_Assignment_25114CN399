package Day_22;

import java.util.Scanner;

public class pallindromestring {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        String rev = ""; // store reversed string

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); // add characters in reverse order
        }

        if (str.equalsIgnoreCase(rev)) { // compare original and reversed string
            System.out.println(str +"Palindrome String");
        } else {
            System.out.println(str +" is not a Palindrome String");
        }

        sc.close();
    }
    
}
