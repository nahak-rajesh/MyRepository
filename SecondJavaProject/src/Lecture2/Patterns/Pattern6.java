
//           *
//          * *
//         * * *
//        * * * *

        package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            int space = 1;
//            while(space<=n-i){
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while(j<=i){
//                System.out.print("*");
//                System.out.print(" ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        for(int i=1; i<=n; i++){
            for(int j=1 ;j<=n; j++){
                if(j<=n-i)
                    System.out.print(" ");
                else {
                    System.out.print("*");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
