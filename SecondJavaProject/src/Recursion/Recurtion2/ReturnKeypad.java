package Recursion.Recurtion2;

import java.util.Scanner;

public class ReturnKeypad {

    public static String[] printKeypad(int n) {
        if (n == 0) {
            String ans[] = {""};
            return ans;
        }
        String smallAns[] = printKeypad(n / 10);
        String helper[] = helper(n % 10);
        String ans[] =new String [smallAns.length * helper.length];
        int k = 0;
        for (int i=0; i<smallAns.length; i++) {
            for (int j=0; j<helper.length; j++) {
                ans[k] = smallAns[i] + helper[j];
                k++;
            }
        }
        return ans;
    }

    public static String[] helper(int n) {
        String hel[] = switch (n) {
            case 2 -> new String[]{"a", "b", "c"};
            case 3 -> new String[]{"d", "e", "f"};
            case 4 -> new String[]{"g", "h", "i"};
            case 5 -> new String[]{"j", "k", "l"};
            case 6 -> new String[]{"m", "n", "o"};
            case 7 -> new String[]{"p", "q", "r"};
            case 8 -> new String[]{"s", "t", "u", "v"};
            case 9 -> new String[]{"w", "x", "y", "z"};
            default -> new String[]{""};
        };
        return hel;
    }
//    public static char[] helper(int n) {
//        char hel[] = switch (n) {
//            case 2 -> new char[]{'a', 'b', 'c'};
//            case 3 -> new char[]{'d', 'e', 'f'};
//            case 4 -> new char[]{'g', 'h', 'i'};
//            case 5 -> new char[]{'j', 'k', 'l'};
//            case 6 -> new char[]{'m', 'n', 'o'};
//            case 7 -> new char[]{'p', 'q', 'r'};
//            case 8 -> new char[]{'s', 't', 'u', 'v'};
//            case 9 -> new char[]{'w', 'x', 'y', 'z'};
//            default -> new char[]{};
//        };
//        return hel;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = printKeypad(n);
        for (int i=0; i< ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
