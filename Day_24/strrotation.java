package Day_24;

import java.util.Scanner;

public class strrotation {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string = ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string = ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) { // rotation possible only if lengths are same
            System.out.println("Not a rotation");
            sc.close();
            return;
        }

        String temp = str1;
        int count = 0;

        while (count < str1.length()) {
            if (temp.equals(str2)) {
                System.out.println("Rotation found");
                System.out.println("Number of rotations = " + count);
                sc.close();
                return;
            }

            temp = temp.substring(1) + temp.charAt(0); // rotate left by 1 position
            count++;
        }

        System.out.println("Not a rotation");

        sc.close();
    }

}
