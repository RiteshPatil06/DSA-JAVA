/**
 * Recursion5 = check if an array is sorted in strictly increasing order
 * 
 */
public class Recursion5 {

    public static Boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index] < arr[index+1]) {
            //array is sorted till now
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
    
}
