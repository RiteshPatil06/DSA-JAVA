/**
 * RecursionAdvance1: print all permutations of a string
 * permutation means all possible arrangements of characters in a string or a set of characters.
 * total permutations of n = n!
 * Time Complexity: O(n!)
 */
public class RecursionAdvance1 {

    // public static void printPermutations(String str, int idx){
    //     if(idx == str.length()){
    //         System.out.println(str);
    //         return;
    //     }
    //     for(int i = idx; i < str.length(); i++){
    //         str = swap(str, idx, i);
    //         printPermutations(str, idx+1);
    //         str = swap(str, idx, i);
    //     }
    // }

    // public static String swap(String str, int i, int j){
    //     char[] arr = str.toCharArray();// convert string to char array
    //     char temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     return String.valueOf(arr);// convert char array to string
    // }

    // public static void main(String[] args) {
    //     String str = "abc";
    //     printPermutations(str, 0);
    // }

/////////////////////

    public static void printPermutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutations(newString, permutation + currChar);
            
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
    
}
