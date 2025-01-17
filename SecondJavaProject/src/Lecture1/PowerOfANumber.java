package Lecture1;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int square = 1;
        for(int i=0; i<n; i++){
            square *= x;
        }
        System.out.println(square);
    }
}
