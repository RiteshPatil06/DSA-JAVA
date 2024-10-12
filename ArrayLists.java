/**
 * ArrayList
 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Accessing the elements of the ArrayList
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        // Removing elements from the ArrayList
        list.remove(2);

        //Adding elements in between the ArrayList
        list.add(1, 5);
        System.out.println(list);

        // Accessing the elements of the ArrayList
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // Size of the ArrayList
        System.out.println("size: " + list.size());

        // Iterating over the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorting the ArrayList
        System.out.println(list);
        // list.sort(null);
        Collections.sort(list);
        System.out.println(list);

        // Clearing the ArrayList
        list.clear();

        // Size of the ArrayList
        System.out.println("size: " + list.size());

        


    }
    
}
