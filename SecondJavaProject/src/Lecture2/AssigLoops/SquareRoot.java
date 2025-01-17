package Lecture2.AssigLoops;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = 1;
        for(int i=n; i>0; i=i/4){
            sqr *= 2;
        }
        System.out.println(sqr);
    }
}
