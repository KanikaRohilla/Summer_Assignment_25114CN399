package Day_24;

import java.util.Scanner;

public class longword {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence = ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" "); // split sentence into words

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length())
                longest = words[i];
        }

        System.out.println("Longest Word = " + longest);
        System.out.println("Length = " + longest.length());

        sc.close();
    }
    
}
