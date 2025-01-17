package stacks_queues.quesue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // add / enqueue elem
        queue.add(2);
        System.out.println(queue.poll()); // remove / dequeue elem
        System.out.println(queue.size()); // size of the queue
        System.out.println(queue.peek()); // give the peek / front elem
    }
}
