package Recursion.Recursion1;

import java.util.Scanner;

public class FirstIndex {

    public static int firstIndex(int []input, int startIndex, int n) {
        if (startIndex >= input.length - 1) {
            if (input[startIndex] == n)
                return startIndex;
            else
                return -1;
        }
        if (input[startIndex] == n)
            return startIndex;
        return firstIndex(input, startIndex + 1, n);
    }
    public static int firstIndex(int []input, int n) {
        return firstIndex(input, 0, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size : ");
        int N = sc.nextInt();
        int []arr = new int[N];
        System.out.println("Enter Array Elements : ");
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter The Match no : ");
        int n = sc.nextInt();
        System.out.println("Index : " + firstIndex(arr, n));
    }
}
