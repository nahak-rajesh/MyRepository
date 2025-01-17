package Recursion.Recursion1a;

import java.util.Scanner;

public class Multiplication {
    private static int multiplication(int n, int m) {
        if (m == 0 || n == 0)
            return 0;
        if (m == 1)
            return n;
        return n + multiplication(n, m - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter The Value of m : ");
        int m = sc.nextInt();
        System.out.println("n x m = " + multiplication(n, m));
    }
}
