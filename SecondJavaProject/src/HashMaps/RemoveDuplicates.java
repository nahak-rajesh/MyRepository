package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {

    public static ArrayList<Integer> removeDuplicates(int []arr) {
        ArrayList<Integer> outPut = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.containsKey(arr[i])) {
                continue;
            }
            outPut.add(arr[i]);
            seen.put(arr[i], true);
        }
        return outPut;
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 5, 6, 3, 8, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 100};
        ArrayList<Integer> ans = removeDuplicates(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
