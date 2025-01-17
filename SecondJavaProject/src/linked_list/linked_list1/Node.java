package linked_list.linked_list1;

public class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        next = null;
    }
}
