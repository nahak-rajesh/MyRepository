package HashMaps;

import java.util.HashMap;

public class PrintArrayIntersection {

    public static void intersection(int []arr1, int []arr2) {
        if (arr1.length == 0 || arr2.length == 0) {
            return;
        }
        HashMap<Integer, Boolean> checker = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!checker.containsKey(arr1[i])) {
                checker.put(arr1[i], true);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (checker.containsKey(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }
    }

    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {2, 3, 5, 6, 7, 2};
        System.out.println("Intersection : ");
        intersection(arr1, arr2);
    }
}
