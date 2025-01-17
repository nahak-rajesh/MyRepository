package HashMaps.Assignment;

import java.util.HashMap;

public class PairsWithDifferenceK {

    public static void printPair(int []arr, int k) {
        HashMap<Integer, Boolean> checker = new HashMap<>();
        for (int num :arr) {
            if (checker.containsKey(num + k)) {
                System.out.println(num + " " + (num+k));
            }
            if (checker.containsKey(num - k)) {
                System.out.println(num+ " " + (num-k));
            }
            checker.put(num, true);
        }
    }

    public static void main(String[] args) {
        int []arr = {5, 1, 2, 4};
        int k = 3;
        printPair(arr, k);
    }
}
