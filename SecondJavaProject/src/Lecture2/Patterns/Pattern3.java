
//        1
//      2 3
//    4 5 6
// 7 8 9 10

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        int val = 1;
//        while(i<=n){
//            int space = 1;
//            while (space<=n-i){
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while (j<=i){
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        int val = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++) {
                if (j <= n - i)
                    System.out.print(" ");
                else {
                    System.out.print(val);
                    val++;
                }
            }
            System.out.println();
        }
    }
}
