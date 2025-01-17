package Array.String.StringAssignment;

import java.util.Scanner;

public class RemoveChar {

    public static String removeChar(String s, char c) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c)
                result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Enter the Char that you want to remove : ");
        String c = sc.nextLine();
        System.out.println("Modified String : ");
        System.out.println(removeChar(s,c.charAt(0)));
    }
}
