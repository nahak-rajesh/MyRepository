package Array.ArrayAssignment4;

import java.util.Scanner;

public class SortByBubble {

    public static void bubbleSort(int [] arr){
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }

    public static void display(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        System.out.println("Enter No of Test Cases : ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int [] arr = takeInput();
            bubbleSort(arr);
            display(arr);
        }
    }
}
