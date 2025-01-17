package Lecture2;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        char n = c.charAt(0);
        boolean rAZ = (n>='A' && n<='Z');
        boolean raz = (n>='a' && n<='z');
        if(rAZ)
            System.out.println(1);
        else if(raz)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
