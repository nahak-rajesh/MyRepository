package Array;

import java.util.Scanner;

public class ArangeNoInTheArray {

    public static int[] arrangeArr(int size){
        int [] arr = new int [size];
//        set mid odd arr element
        for(int i=0; i<size; i++){
            arr[i] = size;
        }
        for(int i=0; i<size/2; i++){
            arr[i] = 2 * i + 1;
            arr[size - i -1] = 2 * i + 2;
        }
        return arr;
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
            int [] arr = arrangeArr(l);
            print(arr);
        }
    }
}
