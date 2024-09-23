import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the power: ");
        double exponent = sc.nextDouble();

        double answer = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + answer);
    }
}
