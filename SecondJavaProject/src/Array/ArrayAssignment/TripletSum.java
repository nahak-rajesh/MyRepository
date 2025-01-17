package Array.ArrayAssignment;

import java.util.Scanner;

public class TripletSum {

    public static int pairs(int [] input, int num){
        int count = 0;
        for(int i=0; i<input.length; i++){
            int p1 = num - input[i];
            for(int j=0; j<input.length; j++){
                int p2 = p1 - input[j];
                for(int k=0; k<input.length; k++){
                    if(i!=j && i!=k && j!=k && p1+p2+input[k]==num){
                        count++;
                    }
                }
            }
        }
        if(count % 2 == 0){
            return  (count / 2) + 1;
        } else {
            return count / 2;
        }
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
        while(N!=0){
            int [] arr = takeInput();
            System.out.println("Enter Checked No : ");
            int x = sc.nextInt();
            int pair = pairs(arr,x);
            System.out.println(pair);
            N--;
        }
    }
}
