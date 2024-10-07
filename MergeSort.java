/**
 * MergeSort
 */
public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int mergedArr[] = new int[ei-si+1];// 0 to 5 = 6 elements
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }

        while(i <= mid){
            mergedArr[k++] = arr[i++];
        }

        while(j <= ei){
            mergedArr[k++] = arr[j++];
        }

        for(int m=0, n=si; m < mergedArr.length; m++, n++){
            arr[n] = mergedArr[m];
        }
    }

    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        divide(arr, 0, n-1);

        //print sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}