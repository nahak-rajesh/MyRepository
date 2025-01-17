package Recursion.Recursion1b;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void towerOfH(int disks, char source, char auxiliary, char destination) {
        if (disks == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        towerOfH(disks - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        towerOfH(disks - 1, auxiliary, source, destination);
    }
    public static void toh(int disks) {
        towerOfH(disks, 'a', 'b' , 'c');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Disks : ");
        int n = sc.nextInt();
        toh(n);
    }
}
