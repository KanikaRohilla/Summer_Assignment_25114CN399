package Day_21;

import java.util.Scanner;

public class stringlength{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        int count = 0; // stores length of string

        try {
            while (true) {
                str.charAt(count); // check character at index
                count++;
            }
        } catch (Exception e) {
            // loop stops when index goes out of range
        }

        System.out.println("Length of string = " + count);

        sc.close();
    }
}