package stacks_queues.quesue;

public class QueueUsingLinkedList<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    T front() throws QueueIsEmptyException {
        if (size == 0) {
            throw new QueueIsEmptyException();
        }
        return front.data;
    }

    public void enqueue(T elem) {
        Node<T> newNode = new Node<>(elem);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() throws QueueIsEmptyException{
        if (size == 0) {
            throw new QueueIsEmptyException();
        }
        T tempData = front.data;
        front = front.next;
        if (size == 1) {
            rear = null;
        }
        size--;
        return tempData;
    }
}
