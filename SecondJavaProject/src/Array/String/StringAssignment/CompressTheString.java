package Array.String.StringAssignment;

import java.util.Scanner;

public class CompressTheString {

    public static String compressedStrung(String s) {
        String ans = "";
        int count = 1, i;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                if (count == 1)
                    ans = ans + s.charAt(i);
                else
                    ans = ans + s.charAt(i) + count;
            }
            count = 1;
        }
        if (count == 1)
            ans = ans + s.charAt(i);
        else
            ans = ans + s.charAt(i) + count;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Compressed String Is : ");
        System.out.println(compressedStrung(s));
    }
}
