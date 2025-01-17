package Recursion.Recurtion2;

import java.util.Scanner;

public class ReplaceCharacterRecursively {

    public static String replaceChar(String s, char c, String reChar) {
        if (s.length() <= 1) {
            if (s.charAt(0) == c)
                return reChar;
            else return s;
        }
        if (s.charAt(0) == c)
            return reChar + replaceChar(s.substring(1), c, reChar);
        else return s.charAt(0) + replaceChar(s.substring(1), c, reChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Enter C1 : ");
        String c1 = sc.nextLine();
        System.out.print("Enter C2 : ");
        String c2 = sc.nextLine();
        System.out.println("Replaced String : " + replaceChar(s, c1.charAt(0), c2));
    }
}
