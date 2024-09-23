
import java.util.Scanner;

public class Question3 {
    public static int greaterOfTwoNo(int a, int b) {
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The greatest of "+a+" and "+ b +" is " + greaterOfTwoNo(a, b));
    }
}
