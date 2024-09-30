/**
 * Recursion9: print keypad combinations
 */
public class Recursion9 {

    public static void printKeypad(String str, String[] keypad, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        int currDigit = str.charAt(idx) - '0';
        String currString = keypad[currDigit];
        for(int i = 0; i < currString.length(); i++){
            printKeypad(str, keypad, idx+1, newString + currString.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        printKeypad(str, keypad, 0, "");
    }

    // public static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    // public static void printKeypad(String str, int idx, String newString){

    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     String mapping = keypad[currChar - '0'];

    //     for(int i=0; i<mapping.length(); i++){
    //         printKeypad(str, idx+1, newString + mapping.charAt(i));
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "23";
    //     printKeypad(str, 0, "");
    // }
    
}
