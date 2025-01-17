package Lecture2.AssigLoops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decimal = 0;
        int power = 1;
        for(int i=n; i>0; i=i/10){
            int r = i % 10;
            decimal += r * power;
            power = power * 2;
        }
        System.out.println(decimal);
    }
}
