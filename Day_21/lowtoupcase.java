package Day_21;

import java.util.Scanner;

public class lowtoupcase {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string = ");
        String str = sc.nextLine();

        String upper = ""; // stores uppercase string

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                upper += (char)(ch - 32); // convert to uppercase
            else
                upper += ch;
        }

        System.out.println("Uppercase string = " + upper);

        sc.close();
    }
}
