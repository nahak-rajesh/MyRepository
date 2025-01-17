package HashMaps.Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueChar {

    public static StringBuilder extractUniqueCh(String s) {
        HashMap<Character, Boolean> checker = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char str :s.toCharArray()) {
            if (!checker.containsKey(str)) {
                sb.append(str);
                checker.put(str, true);
            }
//            checker.put(str, true);
            continue;
        }
        return sb;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Unique Char : " + extractUniqueCh(str));
    }
}
