package Recursion.Recursion1;

import java.util.Scanner;

public class AllIndexOfx {

    public static void allIndex(int []input, int lastIndex, int n) {
        if (lastIndex <= 0) {
            if (input[lastIndex] == n)
                System.out.print(lastIndex);
            else return;
        }
        if (input[lastIndex] == n)
            System.out.print(lastIndex + " ");
        allIndex(input, lastIndex - 1, n);
    }
    public static void allIndex(int []input, int n) {
        allIndex(input, input.length - 1, n);
    }

//    public static void allIndex1(int []input, int firstIndex, int n) {
//        if (firstIndex >= input.length - 1) {
//            if (input[firstIndex] == n)
//                System.out.println(firstIndex);
//            else return;
//        }
//        if (input[firstIndex] == n)
//            System.out.println(firstIndex);
//        allIndex1(input, firstIndex + 1, n);
//    }
//    public static void allIndex1(int []input, int n) {
//        allIndex1(input, 0, n);
//    }
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
        allIndex(arr, n);
    }
}
