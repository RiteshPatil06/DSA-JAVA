/**
 * Recursion4 = find 1st and last occurance of an element in a String
 * Time Complexity: O(n)
 */
public class Recursion4 {

    public static int firstOccurance(String str, char ch, int index) {
        if(index == str.length()) {
            return -1;
        }
        if(str.charAt(index) == ch) {
            return index;
        }
        return firstOccurance(str, ch, index+1);
    }

    public static int lastOccurance(String str, char ch, int index) {
        if(index == str.length()) {
            return -1;
        }
        int restOfString = lastOccurance(str, ch, index+1);
        if(restOfString != -1) {
            return restOfString;
        }
        if(str.charAt(index) == ch) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'l';
        System.out.println("First occurance of " + ch + " is at index " + firstOccurance(str, ch, 0));
        System.out.println("Last occurance of " + ch + " is at index " + lastOccurance(str, ch, 0));
    }

    
}