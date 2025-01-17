package Lecture2.AssigLoops;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int product = 1;
        for(int i=1; i<=n; i++) {
           if(c == 1){
               sum += i;
           }
           else if(c == 2){
               product *= i;
           }
        }
        if(c == 1){
            System.out.println(sum);
        } else if (c == 2){
            System.out.println(product);
        } else
            System.out.println(-1);
    }
}
