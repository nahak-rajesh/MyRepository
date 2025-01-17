package linked_list.linked_list2;

import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // A Doubly LL OBJ Create
        System.out.println(list.size()); // Get the Size of the list
        list.add(10); // Add elem to the list
        list.add(20);
        list.addFirst(30); // Add elem at ind 0
        list.addLast(40); // Add elem at last ind
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // Get the elem by ind
        }
    }
}
