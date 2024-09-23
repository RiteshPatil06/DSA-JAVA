import java.util.Scanner;

public class Question5 {
    public static String isEligibleToVote(int a) {
        if (a > 18) {
            return "Eligible to vote";
        }else{
            return "Not Eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("The given age ("+ a + ") is "+ isEligibleToVote(a));
    }
}
