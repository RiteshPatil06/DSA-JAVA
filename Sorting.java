
public class Sorting {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

        
        //****** bubble sort ******//
        //time complexity: O(n^2)
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

        //****** selection sort ******//
        //time complexity: O(n^2)
        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArray(arr);

        //****** insertion sort ******//
        //time complexity: O(n^2)
        for(int i=0; i<arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            //insert key
            arr[j+1] = key;
        }
        printArray(arr);
    }
}
