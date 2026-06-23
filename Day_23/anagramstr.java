package Day_23;

import java.util.Arrays;
import java.util.Scanner;

public class anagramstr {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string = ");
        String str1 = sc.nextLine();

        str1 = str1.toLowerCase(); // convert entire string to lowercase

        System.out.print("Enter second string = ");
        String str2 = sc.nextLine();

        str2 = str2.toLowerCase(); // convert entire string to lowercase

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] a = str1.toCharArray(); // convert to character array
        char[] b = str2.toCharArray();

        Arrays.sort(a); // sort both arrays
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are not Anagrams.");
        }

        sc.close();
    }
    
}
