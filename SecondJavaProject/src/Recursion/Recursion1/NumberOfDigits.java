package Recursion.Recursion1;

public class NumberOfDigits {
    public static int numOfDig(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + numOfDig(n / 10);
    }
    public static void main(String[] args) {
        int n = 156;
        int ans = numOfDig(n);
        System.out.println(ans);
    }
}
