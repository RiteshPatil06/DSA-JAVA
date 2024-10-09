// Description: Quick Sort algorithm implementation in Java language.
//time complexity: O(nlogn) in average case and O(n^2) in worst case
//space complexity: O(logn) in average case and O(n) in worst case

public class QuickSort {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        //print sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
