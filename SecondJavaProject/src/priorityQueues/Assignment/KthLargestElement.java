package priorityQueues.Assignment;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

class MaxPQComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        }
        return 0;
    }
}

public class KthLargestElement {

    public static void printKLargestElement(int[] arr, int k) {
        MaxPQComparator maxHeap = new MaxPQComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<>(maxHeap);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
//        while (!pq.isEmpty()) {
//            System.out.print(pq.remove() + " ");
//        }
        while (k > 0) {
           if (k == 1) {
               System.out.println(pq.remove());
           }
           pq.remove();
           k--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 7, 11, 3};
        printKLargestElement(arr, 3);
    }
}
