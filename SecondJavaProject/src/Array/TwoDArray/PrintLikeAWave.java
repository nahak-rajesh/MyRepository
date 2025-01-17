package Array.TwoDArray;

import java.util.Scanner;

public class PrintLikeAWave {

    public static void waveDisplay(int [][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0; i<cols; i++){
            if(i % 2 == 0){
                for(int j=0; j<rows; j++){
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for(int j=rows-1; j>=0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
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
            waveDisplay(arr);
            System.out.println();
        }
    }
}
