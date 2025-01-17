package Array.ArrayAssignment;

import java.util.Scanner;

public class Sort01 {

    public static int[] sort(int [] arr){
        int size = arr.length;
        for(int i=0; i<size; i++){
            for(int j=i;j<size; j++){
                if(arr[i] == 1 && arr[j] == 0){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
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
            sort(arr);
            display(arr);
        }
    }
}
