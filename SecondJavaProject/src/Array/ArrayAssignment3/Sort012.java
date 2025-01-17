package Array.ArrayAssignment3;

import java.util.Scanner;

public class Sort012 {

    public static int[] sort(int []arr){
        int size = arr.length;
        int ind0 = 0;
        int ind2 = size - 1;
        for(int i=0; i<size; i++) {
            if (arr[i] == 0 && i >= ind0) {
                int temp = arr[i];
                arr[i] = arr[ind0];
                arr[ind0] = temp;
                ind0++;
            }
        }
        for(int j=size-1; j>=0; j--){
            if(arr[j] == 2 && j <= ind2){
                int temp = arr[j];
                arr[j] = arr[ind2];
                arr[ind2] = temp;
                ind2--;
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
