package Recursion.Recursion1b;

import java.util.Scanner;

public class StringToInt {

    public static int convert(String s) {
        if (s.length() <= 1)
            return s.charAt(0) - '0';
        int x = s.charAt(0) - '0';
        x = x * (int) Math.pow(10, s.length() - 1) + convert(s.substring(1));
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("StringInt is : " + convert(s));
    }
}
