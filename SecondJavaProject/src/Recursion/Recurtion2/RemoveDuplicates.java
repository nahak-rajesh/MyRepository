package Recursion.Recurtion2;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDup(String s) {
        if (s.length() <= 1)
            return s;
        if (s.charAt(0) == s.charAt(1))
            return removeDup(s.substring(1));
        return s.charAt(0) + removeDup(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Replace String : " + removeDup(s));
    }
}
