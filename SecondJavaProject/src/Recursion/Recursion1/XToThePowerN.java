package Recursion.Recursion1;

public class XToThePowerN {
    public static int pow(int n, int p) {
        if(p == 1)
            return n;
        return n * pow(n,p-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int p = 5;
        int ans = pow(n, p);
        System.out.println(ans);
    }
}
