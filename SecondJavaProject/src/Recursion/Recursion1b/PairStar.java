package Recursion.Recursion1b;

import java.util.Scanner;

public class PairStar {

    public static String pairStar(String s) {
        if (s.length() <= 1)
            return s;
        if (s.charAt(0) == s.charAt(1))
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        else return s.charAt(0) + pairStar(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("New String : " + pairStar(s));
    }
}