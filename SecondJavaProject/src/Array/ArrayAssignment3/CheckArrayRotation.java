package Array.ArrayAssignment3;

import java.util.Scanner;

public class CheckArrayRotation {

    public static int rotation(int []arr){
        int size = arr.length;
        int c = 0;
        for(int i=0; i<size-1; i++){
            if(arr[i]>arr[i+1])
                c = i+1;
        }
        return c;
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
            int ans = rotation(arr);
            System.out.println("The rotate array Index : " + ans);
        }
    }
}
