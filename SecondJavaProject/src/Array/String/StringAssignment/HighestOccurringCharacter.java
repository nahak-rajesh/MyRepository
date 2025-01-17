package Array.String.StringAssignment;

import java.util.Scanner;

public class HighestOccurringCharacter {

    public static char highestOccurringChar(String s) {
        char ans = '\0';
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            int count2 = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count2++;
            }
            if (count1 < count2) {
                count1 = count2;
                ans = s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.print("Highest Occurring Char Is : ");
        System.out.println(highestOccurringChar(s));
    }
}
