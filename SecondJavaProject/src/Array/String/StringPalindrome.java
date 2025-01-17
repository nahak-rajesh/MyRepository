package Array.String;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean checkPalindrome(String str){
        boolean isPalindrome = true;
        for(int i=0,j=str.length()-1; i<(str.length()/2); i++,j--){
            if(str.charAt(i) != str.charAt(j))
                isPalindrome = false;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        boolean palindrome = checkPalindrome(str);
        System.out.println("The string is palindrome is : " + palindrome);
    }
}
