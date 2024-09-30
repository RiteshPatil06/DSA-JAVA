
import java.util.HashSet;

/**
 * Recursion8: print all the subsequences of a string
 * Time Complexity: O(2^n)
 */
public class Recursion8 {

    // public static void printSubsequences(String str, int idx, String newString){
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     printSubsequences(str, idx+1, newString + currChar);
    //     printSubsequences(str, idx+1, newString);
    // }

    // public static void main(String[] args) {
    //     String str = "abc";
    //     printSubsequences(str, 0, "");
    // }

/**
 * Recursion8: print all the unique subsequences of a string
 * using hashset!
 * Time Complexity: O(2^n)
 */
    public static void printSubsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString); 
                return;
            }
        }
        char currChar = str.charAt(idx);
        printSubsequences(str, idx+1, newString + currChar, set);
        printSubsequences(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubsequences(str, 0, "", set);
    }
    
}
