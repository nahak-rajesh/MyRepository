package Recursion.Recursion1;

public class PrintNumbers {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 6;
        printNum(n);
    }
}
