package Array.String.StringAssignment;

import java.util.Scanner;

public class ReverseEachWord {

    public static String reverseWord(String s){
       String result = "";
       String revWord = "";
       int start = 0;
       int end;
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == ' '){
               end = i - 1;
               revWord = "";
               for(int j=end; j>=start; j--){
                   revWord += s.charAt(j);
               }
               start = i + 1;
               result = result + revWord + " ";
           }
       }
       revWord = "";
       for(int j=s.length() - 1; j>=start; j--){
           revWord += s.charAt(j);
       }
        result += revWord;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("ReverseWord String : ");
        System.out.println(reverseWord(s));
    }
}
