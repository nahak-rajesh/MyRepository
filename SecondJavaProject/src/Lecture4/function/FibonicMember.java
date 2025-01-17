package Lecture4.function;

import java.util.Scanner;

public class FibonicMember {
   public static boolean isFib(int n){
       int f1 = 0;
       int f2 = 1;
       int f3 = 0;
       while (f3 < n){
           f3 = f1 + f2;
           f1 = f2;
           f2 = f3;
           if(f3 == n)
               return true;
       }
       return false;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ansFib = isFib(n);
        System.out.println(ansFib);
    }
}
