package Day_23;

import java.util.Scanner;

public class nonrepeat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        str = str.toLowerCase(); // convert entire string to lowercase

        boolean found = false; // to check if non-repeating character exists

        for (int i = 0; i < str.length(); i++) {
            int count = 0; // count frequency of current character

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeating character = " + str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}