
import java.util.Scanner;

public class Question1 {
    public static int printAverage(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = printAverage(a, b, c);
        System.out.println("The average of the three numbers is: " + average);
    }
}
