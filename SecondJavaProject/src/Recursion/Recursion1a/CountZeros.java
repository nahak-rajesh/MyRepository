package Recursion.Recursion1a;

import java.util.Scanner;

public class CountZeros {

    private static int count0s(int n) {
        int count = 0;
        if (n < 10) {
            if (n == 0)
                return 1;
            else return 0;
        }
        if (n % 10 == 0)
            count += 1;
        return count + count0s(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        System.out.println("No Of 0s : " + count0s(n));
    }
}
