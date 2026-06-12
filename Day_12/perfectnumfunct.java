package Day_12;

import java.util.Scanner;

public class perfectnumfunct {
    public static boolean Perfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        if (Perfect(num)) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }
    
}
