package Day_4;

import java.util.Scanner;

public class armrange {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number = ");
        int st = sc.nextInt();

        System.out.print("Enter ending number = ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in the range:");

        for (int num = st; num <= end; num++) { // Loop through the range of numbers
            int temp = num;
            int digits = String.valueOf(num).length(); // Calculate the number of digits in the current number
            int sum = 0; // Initialize sum to store the sum of the digits raised to the power of the number of digits

            while (temp > 0) { // Loop to calculate the sum of the digits raised to the power of the number of digits
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
    
}
