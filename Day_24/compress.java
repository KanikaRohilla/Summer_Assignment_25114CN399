package Day_24;

import java.util.Scanner;

public class compress {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        String compress = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                count++; // count repeated characters
            else {
                compress += str.charAt(i) + "" + count;
                count = 1;
            }
        }

        compress += str.charAt(str.length() - 1) + "" + count;

        System.out.println("Compressed String = " + compress);

        sc.close();
    }
    
}
