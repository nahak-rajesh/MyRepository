package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=2*(n-i)){
                System.out.print(" ");
                j++;
            }

            i++;
        }
    }
}
