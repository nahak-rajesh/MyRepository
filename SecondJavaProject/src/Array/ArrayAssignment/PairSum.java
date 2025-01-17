package Array.ArrayAssignment;

import java.util.Scanner;

public class PairSum {

    public static int pairs(int [] input, int num){
        int count = 0;
        for(int i=0; i<input.length; i++){
            int p = num - input[i];
            for(int j=0; j<input.length; j++){
                if(i!=j && p==input[j]){
                    count++;
                }
            }
        }
        return count/2;
    }

    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
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
            int l = sc.nextInt();
            int [] arr = takeInput(l);
            System.out.println("Enter Checked No : ");
            int num = sc.nextInt();
            int pair = pairs(arr,num);
            System.out.println(pair);
        }
    }
}
