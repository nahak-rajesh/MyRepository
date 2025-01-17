
//        1
//        2 3
//        3 4 5
//        4 5 6 7

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            int j = 1;
//            while (j<=i){
//                System.out.print(j + i -1);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+i-1);
            }
            System.out.println();
        }
    }
}
