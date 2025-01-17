package stacks_queues.stacks;

public class StackUsingLinkedList<T> {
    private Node<T> head;
    private int size;

    public StackUsingLinkedList() {
        head = null;
        size =0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size() == 0; // return head == null;
    }

    T top() throws StackEmptyException {
        if (size() == 0) {
//            StackEmptyException e = new StackEmptyException();
//            throw e;
            throw new StackEmptyException();
        }
        return head.data;
    }

    void push(T element) {
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() throws StackEmptyException{
        if (size() == 0) {
//            StackEmptyException e = new StackEmptyException();
//            throw e;
            throw new StackEmptyException();
        }
        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }
}
