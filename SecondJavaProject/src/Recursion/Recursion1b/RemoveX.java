package Recursion.Recursion1b;

import java.util.Scanner;

public class RemoveX {

    private static String remove(String s) {
        if (s.length() <= 1) {
            if (s.charAt(0) != 'x')
                 return s;
            else return "";
        }
        if (s.charAt(0) == 'x')
            return remove(s.substring(1));
        else return s.charAt(0) + remove(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Replace String : " + remove(s));
    }
}
