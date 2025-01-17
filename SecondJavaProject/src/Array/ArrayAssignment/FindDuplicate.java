package Array.ArrayAssignment;

import java.util.Scanner;

public class FindDuplicate {
    public static int[] takeInput(int size){
        Scanner sc = new Scanner(System.in);
        int []input = new int[size];
        for(int i=0; i<size; i++){
            input[i] = sc.nextInt();
        }
        return input;
    }

    public static int duplicate(int []input){
        int ans = 0;
        for(int i=0; i<input.length; i++){
            int count = 0;
            for(int j=0; j<input.length; j++){
                if(i!=j && input[i]==input[j])
                    count++;
            }
            if(count>0)
                ans = input[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int l = sc.nextInt();
            int []arr = takeInput(l);
            int ans = duplicate(arr);
            System.out.println(ans);
        }
    }
}
