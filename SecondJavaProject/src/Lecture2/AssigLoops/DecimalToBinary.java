package Lecture2.AssigLoops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int power = 1;
        for(int i=n; i>0; i=i/2){
            int r = i % 2;
            binary += r * power;
            power *= 10;
        }
        System.out.println(binary);
    }
}
