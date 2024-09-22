public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //part1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //part 2
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = n; i >= 1; i--) {
            //part1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //part 2
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}