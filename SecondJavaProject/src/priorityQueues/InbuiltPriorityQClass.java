package priorityQueues;

import java.util.PriorityQueue;

public class InbuiltPriorityQClass {

    public static void sortKSorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for ( ; i < k; i++) {
            pq.add(arr[i]);
        }
        for ( ; i < arr.length; i++) {
            arr[i - k] = pq.remove();
            pq.add(arr[i]);
        }
        for (int j = arr.length - k; j < arr.length; j++) {
            arr[j] = pq.remove();
        }
    }

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        int[] arr = {9, 1, 0, 4, 7, 3};
//        for (int i = 0; i < arr.length; i++) {
//            //add the elements
//            pq.add(arr[i]);
//        }
//        //return the min element
//            System.out.println(pq.element());
//
//        //isEmpty() check and return true if pq is empty else return false
//        while (!pq.isEmpty()) {
//            System.out.print(pq.remove() + " ");
//        }
//        System.out.println();

        int[] arr = {2, 4, 1, 9, 6, 8};
        int k = 3;
        sortKSorted(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
