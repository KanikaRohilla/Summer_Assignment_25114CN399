package Day_21;

import java.util.Scanner;

public class revstring {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        String rev = ""; // stores reversed string

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string = " + rev);

        sc.close();
    }
    
}
