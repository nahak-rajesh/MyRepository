package Array.ArrayAssignment3;

import java.util.Scanner;

public class SecondLargest {

    public static int secondMax(int [] arr){
        int size = arr.length;
        int max = max(arr);
        int max2 = 0;
        for(int i=0; i<size; i++){
            if(arr[i] < max && max2 < arr[i]){
                max2 = arr[i];
            }
        }
        return max2;
    }
    public static int max(int [] arr){
        int size = arr.length;
        int max = 0;
        for(int i=0; i<size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
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
            int ans = secondMax(arr);
            System.out.println("The Second_Max No : " + ans);
        }
    }
}
