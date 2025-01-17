package Recursion.Recursion2a;

import java.util.Scanner;

public class StairCase {

    public static int stairCase(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        int op1 = stairCase(n - 1);
        int op2 = stairCase(n - 2);
        int op3 = stairCase(n - 3);
        return op1 + op2 + op3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = stairCase(n);
        System.out.println(ans);
    }
}
