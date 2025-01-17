
//        1
//        2 3
//        4 5 6
//        7 8 9 10

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int val = 1;
//        int i = 1;
//        while(i<=n){
//            int j = 1;
//            while (j<=i){
//                System.out.print(val);
//                val = val+1;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        int val = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(val);
                    val++;
            }
            System.out.println();
        }
    }
}
