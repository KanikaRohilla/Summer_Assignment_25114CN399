package Day_25;

import java.util.Scanner;

public class commonchar {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string = ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string = ");
        String str2 = sc.nextLine();

        boolean found = false;

        System.out.print("Common characters = ");

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) != -1) { // character exists in second string
                System.out.print(ch + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No common characters found");
        }

        sc.close();
    }
    
}
