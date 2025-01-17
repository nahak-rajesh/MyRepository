package HashMaps;

import java.sql.SQLOutput;
import java.util.HashMap;

public class MaximumFrequencyNumber {

    public static int maxFreNum(int []arr) {
        HashMap<Integer, Integer> outPut = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (outPut.containsKey(arr[i])) {
                System.out.println(outPut.containsKey(arr[i]));
                outPut.put(arr[i], outPut.get(arr[i]) + 1);
                System.out.println(i + ":" + outPut.get(arr[i]) + 1);
            } else {
                outPut.put(arr[i], 1);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < outPut.get(arr[i])) {
                maxValue = outPut.get(arr[i]);
                maxKey = arr[i];
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 3, 3, 8};
        System.out.println("MaximumFrequencyNumber : " + maxFreNum(arr));
    }
}
