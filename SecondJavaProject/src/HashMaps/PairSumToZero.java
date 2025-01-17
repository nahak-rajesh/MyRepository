package HashMaps;

import java.util.HashMap;

public class PairSumToZero {

    public static void pairSum0(int []arr) {
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (int a: arr) {
            if (seen.containsKey(-a)) {
                System.out.println(a + " " + -a);
            }
            seen.put(a, true);
        }
    }

    public static void main(String[] args) {
        int []arr = {1, 2, -2, 4, 2};
        pairSum0(arr);
    }
}
