package Array;

import java.util.Scanner;

public class SwapAlternate {

    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
        int input[] = new int[size];
        for(int i=0; i<size; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static int[] swap(int []input){
        for(int i=0; i<input.length; i=i+2){
            if(i == input.length - 1 && i % 2 == 0){
                break;
            }
            input[i] = input[i] + input[i+1];
            input[i+1] = input[i] - input[i+1];
            input[i] = input[i] - input[i+1];
        }
        return input;
    }

    public static void print(int [] input){
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int l = sc.nextInt();
            int arr[] = takeInput(l);
            swap(arr);
            print(arr);
        }
    }
}
