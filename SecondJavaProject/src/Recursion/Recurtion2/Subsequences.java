package Recursion.Recurtion2;

public class Subsequences {

    public static String[] findSubsequences(String s) {
        if (s.length() == 0) {
            String ans[] = {""};
            return ans;
        }
        String smallAns[] = findSubsequences(s.substring(1));
        String ans[] = new String[2 * smallAns.length];
        for (int i=0; i<smallAns.length; i++) {
            ans[i] = smallAns[i];
        }
        for (int i=0; i<smallAns.length; i++) {
            ans[i + smallAns.length] = s.charAt(0) + smallAns[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "xyz";
        String []ans = findSubsequences(str);
        for (int i=0; i< ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
