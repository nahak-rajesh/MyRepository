package Recursion.Recursion1a;

import java.util.Scanner;

public class GeometricSum {
    public static double geoSum(int n) {
        if (n == 0)
            return 1;
        double sum = (1 / Math.pow(2,n));
        return sum + geoSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No : ");
        int n = sc.nextInt();
        System.out.println("GeoSum is : " + geoSum(n));
    }
}
