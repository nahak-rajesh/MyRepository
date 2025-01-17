package Recursion.Recursion2a;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int []arr, int n) {
        return binarySearch(arr, 0, arr.length - 1, n);
    }

    public static int binarySearch(int []arr, int sI, int eI, int n) {
        if (sI > eI)
            return -1;
        int mid = (sI + eI) / 2;
        if (arr[mid] == n)
            return mid;
        else if (arr[mid] < n)
            return binarySearch(arr, mid + 1, eI, n);
        else
            return binarySearch(arr, sI, mid - 1, n);
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size : ");
        int n = sc.nextInt();
        int []input = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = takeInput();
        System.out.print("Enter The Search Element : ");
        int n = sc.nextInt();
        System.out.println("The Search Element Is Present at Index : " + binarySearch(arr, n));
    }
}
