package Array.TwoDArray;

import java.util.Scanner;

public class ColmnHaveLargeSum {

    public static int largestColSum(int [][]arr){
        int largest = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;
        for(int j=0; j<cols; j++){
            int sum = 0;
            for(int i=0; i<rows; i++){
                sum += arr[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        return largest;
    }

    public static void display(int [][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
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
        System.out.println("The Array Is : ");
        display(arr);
        System.out.println("LargestColSum : " + largestColSum(arr));
    }
}
