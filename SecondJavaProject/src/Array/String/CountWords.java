package Array.String;

import java.util.Scanner;

public class CountWords {

    public static int count(String s){
        int count = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        int noOfWords = count(str);
        System.out.println("No Of Words : " + noOfWords);
    }
}
