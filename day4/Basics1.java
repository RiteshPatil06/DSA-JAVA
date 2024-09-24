import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args) {
    //method 1
        // int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;

    //method 2
        //int[] arr = {10, 20, 30, 40, 50};

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

    //2D array
        int[][] arr = new int[3][5];

    //array as an input
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] numbers = new int[size];

        // for (int i = 0; i < size; i++) {
        //     numbers[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        //     System.out.println(numbers[i]);
        // }

    //array of names as input from the user and print them on the screen
        //   Scanner sc = new Scanner(System.in);
        //   int size = sc.nextInt();
        //   String names[] = new String[size];


        //   //input
        //   for(int i=0; i<size; i++) {
        //       names[i] = sc.next();
        //   }
        
        //   //output
        //    for(int i=0; i<names.length; i++) {
        //        System.out.println("name " + (i+1) +" is : " + names[i]);
        //    }

    //Find the maximum & minimum number in an array of integers. 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];


        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }


        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
    
        // for(int i=0; i<numbers.length; i++) {
        //     if(numbers[i] < min) {
        //         min = numbers[i];
        //     }
        //     if(numbers[i] > max) {
        //         max = numbers[i];
        //     }

        // }
        
        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);
 
    //check if it is an array sorted in ascending order.
        boolean isSorted = true;
        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }



    }

}

