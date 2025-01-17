package Array.ArrayAssignment3;

import java.util.Scanner;

public class SumOf2Arrays {

    public static int[] sum(int []arr1,int []arr2){
        int na = arr1.length;
        int nb = arr2.length;
        int nc;
//        For Set The Sum Array Length
        if(na > nb){
            nc = na + 1;
        } else {
            nc = nb + 1;
        }
        int []arr3 = new int [nc];
        int sum = 0;
        int carry = 0;
        int i = na - 1;
        int j = nb - 1;
        int k = nc - 1;
        while(i>=0 && j>=0){
            sum = arr1[i] + arr2[j] + carry;
            i--;
            j--;
            arr3[k] = sum % 10;
            sum = sum / 10;
            carry  = sum % 10;
            k--;
        }
        if(na > nb){
            while(i>=0){
                sum = arr1[i] + carry;
                i--;
                arr3[k] = sum % 10;
                sum = sum / 10;
                carry  = sum % 10;
                k--;
            }
        } else if (nb > na) {
            while(j>=0){
                sum = arr2[j] + carry;
                j--;
                arr3[k] = sum % 10;
                sum = sum / 10;
                carry  = sum % 10;
                k--;
            }
        }
        arr3[k] = carry;
        return arr3;
    }

    public static void display(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size Of The Array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No Of Test Cases : ");
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int []arr1 = takeInput();
            int []arr2 = takeInput();
            int []arr3 = sum(arr1,arr2);
            System.out.println("SUM : ");
            display(arr3);
        }
    }
}
