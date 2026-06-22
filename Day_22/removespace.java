package Day_22;

import java.util.Scanner;

public class removespace {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        String result = str.replace(" ", ""); // remove all spaces

        System.out.println("String without spaces: " + result);

        sc.close();
    }
    
}
