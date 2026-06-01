package Day_1;
import java.util.Scanner;

public class sumnatural {
    public static void main(String[] args){

        Scanner r = new Scanner(System.in);

        int n, i, sum = 0;

        System.out.print("Enter a number = ");

        n = r.nextInt();

        for(i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.println("Sum of First " + n + " Natural Numbers is = " + sum);
    }    
}
