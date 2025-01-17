package Array;

import java.util.Scanner;

public class LargestElement {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] input = new int [size];
        for(int i = 0; i < size; i++){
            input [i] = sc.nextInt();
        }
        return input;
    }
    public static int largest(int [] input){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<input.length; i++){
            if(input[i] > large){
                large = input[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int [] arr = takeInput();
        int max = largest(arr);
        System.out.println(max);
    }
}
