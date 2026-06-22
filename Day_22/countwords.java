package Day_22;

import java.util.Scanner;

public class countwords {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence = ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) { // check for empty input
            System.out.println("Number of words = 0");
        } else {
            String[] words = sentence.split("\\s+"); // split using spaces
            System.out.println("Number of words = " + words.length);
        }

        sc.close();
    }
    
}
