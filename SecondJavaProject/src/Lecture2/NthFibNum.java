package Lecture2;

import java.util.Scanner;

public class NthFibNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 1, f2 = 1;
        int val = 0;
        for (int i = 3; i <= n; i++) {
            val = f1 + f2;
            f1 = f2;
            f2 = val;
        }
        System.out.println(val);
    }
}
