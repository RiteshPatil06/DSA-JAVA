/**
 * RecursionAdvance2:count total paths in a maze to move from (0, 0) to (n, m)
 * where you can move either right or down
 * n=3, m=3
 * Total paths=6
 * Time Complexity: O(2^(n+m))
 */
public class RecursionAdvance2 {

    public static int countPaths(int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return countPaths(n-1, m) + countPaths(n, m-1);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPaths(n, m));
    }
    

}
