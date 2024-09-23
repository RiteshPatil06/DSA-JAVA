
import java.util.Scanner;

public class Question2 {
    public static int printSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum of odd numbers from 1 to "+ n + " is "+ printSum(n));
    }

}
