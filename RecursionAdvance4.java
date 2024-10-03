/**
 * RecursionAdvance4: find the number of ways in which you can invite n people
 * tou your party, single or in pairs
 * n=4
 * Total ways=3
 * Time Complexity: O(2^n)
 */
public class RecursionAdvance4 {

    public static int invitePeople(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return invitePeople(n-1) + (n-1)*invitePeople(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(invitePeople(n));
    }
    
}
