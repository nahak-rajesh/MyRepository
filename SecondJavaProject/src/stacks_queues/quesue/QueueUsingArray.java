package stacks_queues.quesue;

public class QueueUsingArray {
    private int data[];
    private int front; // Index at which front element is stored
    private int rear; // Index at which rear element is stored
    private int size;
    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int front() throws QueueIsEmptyException{
        if (size() == 0) {
            throw new QueueIsEmptyException();
        }
        return data[front];
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i < front; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }
    void enqueue(int elem) throws QueueFullException {
        if (size() == data.length) {
            doubleCapacity();
//            throw new QueueFullException();
        }
        if (size() == 0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
//        rear++;
//        if (rear == data.length) {
//            rear = 0;
//        }
        data[rear] = elem;
        size++;
    }

    int deque() throws QueueIsEmptyException {
        if (size() == 0) {
            throw new QueueIsEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
//        front++;
//        if (front == data.length) {
//            front = 0;
//        }
        size--;
        if (size() == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

}
