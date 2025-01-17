package Recursion.Recursion1a;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumDig(int n) {
        if (n < 10)
            return n;
        int rem = n % 10;
        return rem + sumDig(n /10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        System.out.println("DigSum is : " + sumDig(n));
    }
}
