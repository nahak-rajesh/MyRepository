package Array;

import java.util.Scanner;

public class TakeInputOrPrint {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] input = new int [size];
        for(int i = 0; i < size; i++){
            input [i] = sc.nextInt();
        }
        return input;
    }
    public static void print(int [] input){
        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
        }
    }
    public static void main(String[] args) {
        int arr [] = takeInput();
        print(arr);
    }
}
