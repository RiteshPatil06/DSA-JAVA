/**
 * RecursionAdvance3: place tiles of size 1xm in a floor of nxm
 * n=4, m=2
 * Total ways=5
 * Time Complexity: O(2^n)
 */
public class RecursionAdvance3 {

    public static int placeTiles(int n, int m){
        if(n < m){
            return 1;
        }
        if(n == m){
            return 2;
        }
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;
        System.out.println(placeTiles(n, m));
    }
    
}