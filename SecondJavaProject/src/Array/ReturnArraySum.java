package Array;

import java.util.Scanner;

public class ReturnArraySum {

    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
        int [] input = new int [size];
        for(int i = 0; i < size; i++){
            System.out.print("arr [" + i + "] = ");
            input [i] = sc.nextInt();
        }
        return input;
    }

    public static int sumTheArray(int [] input){
        int sum = 0;
        for(int i=0; i<input.length; i++){
            sum += input[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NO of Arrays : ");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            System.out.print("Length of arr" + (i + 1) + " : ");
            int l = sc.nextInt();
            int [] arr = takeInput(l);
            int value = sumTheArray(arr);
            System.out.println("Sum of arr" + i + " Elements : " + value);
        }
    }
}
