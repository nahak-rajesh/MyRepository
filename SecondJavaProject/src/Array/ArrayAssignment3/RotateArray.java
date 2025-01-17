package Array.ArrayAssignment3;

import java.util.Scanner;

public class RotateArray {

    public static int[] rotate(int [] arr, int num){
        int size = arr.length;
        for(int i=0; i<size-num; i++){
                    int swap = arr[i];
                    arr[i] = arr[i + num];
                    arr[i + num] = swap;
        }
        return arr;
    }

    public static void display(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        int [] input = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<size; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NO of Times : ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int [] arr = takeInput();
            System.out.println("Enter rotate element no : ");
            int num = sc.nextInt();
            rotate(arr,num);
            display(arr);
        }
    }
}
