package Recursion.Recursion1;

import java.util.Scanner;

public class LastIndex {

//    Check the array from start to end
    public static int startIndex(int []input, int startIndex, int n) {
        if (startIndex >= input.length - 1) {
            if (input[startIndex] == n)
                return startIndex;
            else
                return -1;
        }
        return startIndex(input, startIndex + 1, n);
    }
    public static int startIndex(int []input, int n) {
        return startIndex(input, 0, n);
    }

    //    Check the array from end to start
    public static int lastIndex(int []input, int endIndex, int n) {
        if (endIndex <= 0) {
            if (input[endIndex] == n)
                return endIndex;
            else
                return -1;
        }
        if (input[endIndex] == n)
            return endIndex;
        return lastIndex(input, endIndex - 1, n);
    }
    public static int lastIndex(int []input, int n) {
        return lastIndex(input, input.length - 1, n);
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
        System.out.println("Index : " + lastIndex(arr, n));
        System.out.println("Index : " + startIndex(arr, n));
    }
}
