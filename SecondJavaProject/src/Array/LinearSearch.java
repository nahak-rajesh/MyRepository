package Array;

import java.util.Scanner;

public class LinearSearch {
    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
        int [] input = new int [size];
        for(int i = 0; i < size; i++){
            System.out.print("arr [" + i + "] = ");
            input [i] = sc.nextInt();
        }
        return input;
    }

    public static int linSearch(int [] input){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Element : ");
        int x = sc.nextInt();
        System.out.println("Value : ");
        for(int i=0; i<input.length; i++){
            if(input[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NO of Arrays : ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            System.out.print("Length of arr" + (i + 1) + " : ");
            int l = sc.nextInt();
            int [] arr = takeInput(l);
            int value = linSearch(arr);
            System.out.println(value);
        }
    }
}
