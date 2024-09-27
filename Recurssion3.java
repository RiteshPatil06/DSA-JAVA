/**
 * Recurssion3 = print a string in reverse order
 * time complexity = O(n)
 */
public class Recurssion3 {

    public static void printReverse(String str) {
        if(str.length() == 0) {
            return;
        }
        printReverse(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {
        String str = "Hello";
        printReverse(str);
    }
    
}