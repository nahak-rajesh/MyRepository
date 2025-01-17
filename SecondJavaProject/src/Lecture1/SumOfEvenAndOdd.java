package Lecture1;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        int i = 1;
        int sEven = 0;
        int sOdd = 0;
        while(i <= range){
            int num = sc.nextInt();
            if(num % 2 == 0){
                sEven += num;
            } else {
                sOdd += num;
            }
            i++;
        }
        System.out.print(sEven);
        System.out.print(" ");
        System.out.println(sOdd);
    }
}
