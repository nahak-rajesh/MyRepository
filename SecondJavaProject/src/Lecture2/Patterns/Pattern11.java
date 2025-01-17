
//         1
//       232
//     34543
//   4567654
// 567898765

package Lecture2.Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int space = 1;
            while (space <= 2*(n-i)) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            int p = i;
            while (j <= i) {
                System.out.print(p);
                p++;
                j++;
            }
            p = p - 2;
            j = 1;
            while (j <= i - 1) {
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
