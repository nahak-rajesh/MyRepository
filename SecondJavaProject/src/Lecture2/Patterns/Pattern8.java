
//                1
//             1 2
//         1 2 3
//     1 2 3 4

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n){
//            int j = 1;
//            while(j<=2*(n-i)){
//                System.out.print(" ");
//                j++;
//            }
//            j = 1;
//            while(j<=i){
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
