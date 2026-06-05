package Day_5;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:- ");

        for (int i = 1; i <= num; i++) { // Loop to find the factors of the number
            if (num % i == 0) { // Check if the current number is a factor of the original number
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    
}
