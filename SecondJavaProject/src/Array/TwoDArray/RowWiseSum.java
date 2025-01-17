package Array.TwoDArray;

import java.util.Scanner;

public class RowWiseSum {

    public static void sum(int [][]arr){
        System.out.println("i"+arr.length);
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no Of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no Of Columns : ");
        int cols = sc.nextInt();
        int [][]input = new int[rows][cols];
        System.out.println("Enter The array Elements : ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                input[i][j] = sc.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int [][]arr = takeInput();
        System.out.println("Result : ");
        sum(arr);
    }
}
