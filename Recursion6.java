/**
 * Recursion6: move all x to the end of the string
 * Time Complexity: O(n)
 */
public class Recursion6 {

    // public static String moveXtoEnd(String str){
    //     if(str.length() == 0){
    //         return "";
    //     }
    //     char ch = str.charAt(0);
    //     String ans = moveXtoEnd(str.substring(1));
    //     if(ch == 'x'){
    //         return ans + ch;
    //     }
    //     return ch + ans;
    // }

    public static void moveXtoEnd(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveXtoEnd(str, idx+1, count, newString);
        }else{
            newString += currChar;
            moveXtoEnd(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbxcxdxexfxg";
        moveXtoEnd(str, 0, 0, "");
    }

    
}
