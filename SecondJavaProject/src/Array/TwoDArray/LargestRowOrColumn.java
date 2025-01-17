package Array.TwoDArray;

import java.util.Scanner;

public class LargestRowOrColumn {

    public static void largestSum(int [][]input){
        int rows = input.length;
        int cols = input[0].length;
        int largestRow = Integer.MIN_VALUE;
        int indexRow = 0;
        for(int i=0; i<rows; i++){
            int sum = 0;
            for(int j=0; j<cols; j++){
                sum += input[i][j];
            }
            if(sum > largestRow){
                largestRow = sum;
                indexRow = i;
            }
        }
        int largestCol = Integer.MIN_VALUE;
        int indexCol = 0;
        for(int j=0; j<cols; j++){
            int sum = 0;
            for(int i=0; i<rows; i++){
                sum += input[i][j];
            }
            if(sum > largestCol){
                largestCol = sum;
                indexCol = j;
            }
        }
        if(largestRow >= largestCol){
            System.out.print("row " + " " + indexRow + " " + largestRow);
        } else {
            System.out.print("column " + " " + indexCol + " " + largestCol);
        }
    }

    public static void display(int [][]input){
        int rows = input.length;
        int cols = input[0].length;
        System.out.println("The Array is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("No of Rows : ");
        int N = sc.nextInt();
        System.out.println("No of Cols : ");
        int M = sc.nextInt();
        int [][]input = new int[N][M];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                input[i][j] = sc.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No Of Attempt : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int [][]arr = takeInput();
            display(arr);
            largestSum(arr);
            System.out.println();
        }
    }
}
