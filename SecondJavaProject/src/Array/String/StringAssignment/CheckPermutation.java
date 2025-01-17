package Array.String.StringAssignment;

import java.util.Scanner;

public class CheckPermutation {

    public static boolean checkPermutation(String s1, String s2){
        boolean checkPer = true;
        int temp = 0;
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j)){
//                        System.out.println(s1.charAt(i));
//                        System.out.println(s1.charAt(j));
                        temp++;
//                        System.out.println(temp);
                    }
                }
            }
            if (s1.length() == temp) {
                checkPer = true;
            }
        } else {
            checkPer = false;
        }
        return checkPer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String s2 = sc.nextLine();
        System.out.println("Is Permutation : " + checkPermutation(s1,s2));
    }
}
