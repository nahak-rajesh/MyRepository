package stacks_queues.quesue;

public class QueueUse {
    public static void main(String[] args) {
//        QueueUsingArray queue = new QueueUsingArray(3);

//        for (int i = 1; i <= 5; i++) {
//            try {
//                queue.enqueue(i);
//            } catch (QueueFullException e) {
//
//            }
//        }
//
//        while (!queue.isEmpty()) {
//            try {
//                System.out.println(queue.deque());
//            } catch (QueueIsEmptyException e) {
//
//            }
//        }

        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueIsEmptyException e) {

            }
        }
    }
}
