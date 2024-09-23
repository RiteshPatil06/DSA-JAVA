import java.util.Scanner;

public class Question4 {
    public static double findCircumference(int a) {
        double circumference = (2 * 3.14 * a);
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("THe circumference of given radius (" + a + ") is " + findCircumference(a));
    }
}
