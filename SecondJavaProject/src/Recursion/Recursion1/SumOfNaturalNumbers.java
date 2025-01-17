package Recursion.Recursion1;

public class SumOfNaturalNumbers {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = sum(n);
        System.out.println(ans);
    }
}
