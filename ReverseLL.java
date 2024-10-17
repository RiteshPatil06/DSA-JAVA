import java.util.*;

public class ReverseLL {
    // Reverse a linked list using Collections.reverse() method
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Reversing the linked list
        Collections.reverse(list);
        System.out.println(list);
    }


}
