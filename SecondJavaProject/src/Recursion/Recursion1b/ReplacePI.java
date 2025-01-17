package Recursion.Recursion1b;

import java.util.Scanner;

public class ReplacePI {

    public static String replacePI1(String s) {
        if (s.length() <= 1)
            return s;
        String smallans = replacePI1(s.substring(1));
        if (s.charAt(0) == 'p' && smallans.charAt(0) == 'i')
            smallans = "3.14" + smallans.substring(1);
        else
            smallans = s.charAt(0) + smallans;
        return smallans;
    }

    public static String replacePI2(String s) {
        if (s.length() <= 1)
            return s;
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i')
            return  "3.14" + replacePI2(s.substring(2));
        else return s.charAt(0) + replacePI2(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Replace1 String : " + replacePI1(s));
        System.out.println("Replace2 String : " + replacePI2(s));
    }
}
