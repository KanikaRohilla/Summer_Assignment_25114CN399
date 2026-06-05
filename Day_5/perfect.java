package Day_5;

import java.util.Scanner;

public class perfect {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int sum = 0;

        //perfect number is a number that is equal to the sum of its factors excluding itself

        for (int i = 1; i < num; i++) { // Loop to find the factors of the number and calculate their sum
            if (num % i == 0) { // Check if the current number is a factor of the original number
                sum += i; // Add the factor to the sum
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }
    
}
