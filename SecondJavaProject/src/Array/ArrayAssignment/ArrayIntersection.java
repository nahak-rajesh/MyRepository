package Array.ArrayAssignment;

import java.util.Scanner;

public class ArrayIntersection {

    public static void intersection(int [] arr1, int [] arr2){
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(i != j && arr1[i]==arr2[j]){
                    System.out.print(arr2[j] + " ");
                }
            }
        }
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
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Size of arr1 : ");
            int N = sc.nextInt();
            int []arr1 = takeInput(N);
            System.out.println("Size of arr2 : ");
            int M = sc.nextInt();
            int []arr2 = takeInput(M);
            System.out.println("Intersection Array : ");
            intersection(arr1,arr2);
        }
    }
}
