package Day_25;

import java.util.Scanner;

public class sortbylength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words = ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter " + n + " words = ");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) { // bubble sort based on length
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Words sorted by length =");
        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
    
}
