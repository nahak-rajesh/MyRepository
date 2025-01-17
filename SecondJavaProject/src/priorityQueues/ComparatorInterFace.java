package priorityQueues;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return -1;
        } else if (o1.length() > o2.length()) {
            return 1;
        }
        return 0;
    }
}

class MinPQComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return -1;
        } else if (o1 > o2) {
            return 1;
        }
        return 0;
    }
}

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

public class ComparatorInterFace {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3, 6};
        System.out.println("MINPQCOMPARATOR");
        MinPQComparator minPQComparator = new MinPQComparator();
        PriorityQueue<Integer> pq = new PriorityQueue<>(minPQComparator);
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + " ");
        }
        System.out.println();

        System.out.println("MAXPQCOMPARATOR");
//        MinPQComparator maxPQComparator = new MinPQComparator();
//        PriorityQueue<Integer> pq1 = new PriorityQueue<>(maxPQComparator);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq1.add(arr[i]);
        }
        while (!pq1.isEmpty()) {
            System.out.print(pq1.remove() + " ");
        }
        System.out.println();

        System.out.println("STRING_LENGTH_COMPARATOR");
        String[] sArr = {"good.", "I", "am"};
        StringLengthComparator strComparator = new StringLengthComparator();
        PriorityQueue<String> pqStr = new PriorityQueue<>(strComparator);
        for (int i = 0; i < sArr.length; i++) {
            pqStr.add(sArr[i]);
        }
        while (!pqStr.isEmpty()) {
            System.out.print(pqStr.remove() + " ");
        }
        System.out.println();
    }
}
