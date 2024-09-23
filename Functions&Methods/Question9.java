public class Question9 {

        // Function to calculate GCD using Euclid's algorithm
        public static int gcd(int a, int b) {
            // Base case: if b is 0, GCD is a
            if (b == 0) {
                return a;
            }
            // Recursive case: GCD of (b, a % b)
            return gcd(b, a % b);
        }
    
        public static void main(String[] args) {
            int num1 = 56;
            int num2 = 98;
    
            int result = gcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        }
    
    
}
