/**
 * RecursionAdvance5: print all the subsets of a set of first n natural numbers
 * n=3
 * Total subsets=8
 * Time Complexity: O(2^n)
 */
public class RecursionAdvance5 {

    public static void printSubsets(int n, String subset){
        if(n == 0){
            System.out.println(subset);
            return;
        }
        printSubsets(n-1, subset + n + " ");
        printSubsets(n-1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        printSubsets(n, "");
    }
    
}
