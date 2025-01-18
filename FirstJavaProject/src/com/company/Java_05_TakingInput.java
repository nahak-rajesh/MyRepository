package com.company;
import java.util.Scanner;

public class Java_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input From The user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 :");
        int a = sc.nextInt();
        System.out.println("Enter no 2 :");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Sum of these numbers is :");
        System.out.println(sum);

        System.out.println("Enter b1 : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
