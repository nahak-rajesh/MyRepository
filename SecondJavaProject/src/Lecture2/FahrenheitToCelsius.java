package Lecture2;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int i = s;
        int c;
        while(i <= e){
            c = ((i-32)*5)/9;
            System.out.println(i + " " + c);
            i = i + w;
        }
    }
}
