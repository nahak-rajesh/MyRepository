package Array.String;

import java.util.Scanner;

public class AllSubStrings {

    public static void subString(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String str = sc.nextLine();
        System.out.println("String SubStrings are : ");
        subString(str);
    }
}
