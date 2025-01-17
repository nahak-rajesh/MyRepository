package Lecture2.AssigLoops;

import java.util.Scanner;

public class TermsOfAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int product;
        for(int i=1; i<=x; i++){
            product = (3*i)+2;
            if(product % 4 == 0){
                x = x + 1;
            } else {
                System.out.println(product);
            }
        }
    }
}
