package Array.String.StringAssignment;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeDuplicate(String s){
        String result = "";
        char ch = s.charAt(0);
        result += ch;
        for(int i=1; i<s.length(); i++){
            if(ch != s.charAt(i)){
                ch = s.charAt(i);
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String s = sc.nextLine();
        System.out.println("RemoveDuplicate String is : ");
        System.out.println(removeDuplicate(s));
    }
}
