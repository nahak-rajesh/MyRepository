package Array.TwoDArray;

import java.util.Scanner;

public class PrintSpiral {

    public static void spiralDisplay(int [][]arr){
//        rs = rowStart, re = rowEnd
        int rs = 0;
        int re = arr.length-1;
//        cs = columnStart, ce = columnEnd
        int cs = 0;
        int ce = arr[0].length-1;
        int i,j;
        int count = 1;
        if (re+1 == 1){
            for (j=cs; j<=ce; j++){
                System.out.print(arr[rs][j] + " ");
            }
        } else if (ce+1 == 1){
            for (i=rs; i<=re; i++){
                System.out.print(arr[i][cs] + " ");
            }
        } else {
            while (count <= arr.length * arr[0].length){
                for (j=cs; j<=ce; j++){
                    System.out.print(arr[rs][j] + " ");
                    count++;
                }
                rs++;
                for (i=rs; i<=re; i++){
                    System.out.print(arr[i][ce] + " ");
                    count++;
                }
                ce--;
                for (j=ce; j>=cs; j--){
                    System.out.print(arr[re][j] + " ");
                    count++;
                }
                re--;
                for (i=re; i>=rs; i--){
                    System.out.print(arr[i][cs] + " ");
                    count++;
                }
                cs++;
            }
        }
    }

    public static void display(int [][]input){
        int rows = input.length;
        int cols = input[0].length;
        System.out.println("The Array is : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(input[i][j] + " ");
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
            System.out.println("Spiral Print is : ");
            spiralDisplay(arr);
            System.out.println();
        }
    }
}
