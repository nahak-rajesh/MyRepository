
///           *
//          * * *
//        * * * * *
//      * * * * * * *

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern7 {
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
//                j++;
//            }
//            j = 1;
//            int val = i-1;
//            while(j<=i-1){
//                System.out.print("*");
//                val--;
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
                }
            }
            //int val = i-1;
            for(int j=1;j<=i-1;j++) {
                System.out.print("*");
               // val--;
            }
            System.out.println();
        }
    }
}
