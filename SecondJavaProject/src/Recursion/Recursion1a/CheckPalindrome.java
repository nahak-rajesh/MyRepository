package Recursion.Recursion1a;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean checkPal(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)){
            return checkPal(s.substring(1, s.length() - 1));
        }
       return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Palindrome : " + checkPal(s));
    }
}
