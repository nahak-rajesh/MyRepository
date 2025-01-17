package Lecture2.AssigLoops;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        for(int i=n; i>0; i=i/10){
            int r = i % 10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);
    }
}
