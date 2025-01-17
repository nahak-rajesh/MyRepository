package Array.ArrayAssignment4;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int [] arr,int n){
        int size = arr.length;
        int start = 0;
        int end = size - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(n == arr[mid]){
                return mid;
            } else if (n > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
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
        int [] arr = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Test Cases : ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            System.out.print("Enter the Match Element : ");
            int match = sc.nextInt();
            int ans = binarySearch(arr,match);
            System.out.print("Match Index : ");
            System.out.println(ans);
        }
    }
}
