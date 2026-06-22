package Day_22;

import java.util.Scanner;

public class charfreq {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        System.out.print("Enter a character to find frequency = ");
        char ch = sc.next().charAt(0);

        int count = 0; // store frequency

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);

        sc.close();
    }
    
}
