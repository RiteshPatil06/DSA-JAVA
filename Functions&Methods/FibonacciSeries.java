import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Initialize first two terms
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
