package Day_25;

import java.util.Arrays;
import java.util.Scanner;

public class sortalphabatically {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names = ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        System.out.print("Enter " + n + " names = ");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names); // sort alphabetically

        System.out.print("Sorted Names = ");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
    
}
