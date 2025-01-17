package Array.String;

import java.util.Scanner;

public class StringPrefix {

    public static void printPrefix(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.substring(0,i+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("String prefix is : ");
        printPrefix(str);
    }
}
