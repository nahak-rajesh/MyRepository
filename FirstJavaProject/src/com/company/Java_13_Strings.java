package com.company;
import java.util.Scanner;

public class Java_13_Strings {
    public static void main(String[] args) {
        //String name = new String("Rajesh");
        String name = "Rajesh";
        System.out.print("The name is : ");
        System.out.println(name);

        int a = 6;
        float b = 5.6456f;
        System.out.printf("The value of a is %d and value of b is %f.\n",a,b);
        System.out.format("The value of a is %d and value of b is %f.\n",a,b);
        Scanner sc = new Scanner(System.in);
        //String  st = sc.next();
        String  st = sc.nextLine();
        System.out.println(st);
    }
}
