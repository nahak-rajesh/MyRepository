package Array.TwoDArray;

import java.util.Scanner;

public class TwoDArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no of Columns : ");
        int cols = sc.nextInt();
        int input[][] = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print("input[" + i + "]" + "[" + j + "] : ");
               input[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
