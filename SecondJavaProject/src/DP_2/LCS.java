package DP_2;

public class LCS {

    public static int lcs(String s, String t) {
        if(s.length() == 0 || t.length() == 0)
            return 0;

        if (s.charAt(0) == t.charAt(0)) {
            return 1 + lcs(s.substring(1), t.substring(1));
        } else {
            int op1 = lcs(s, t.substring(1));
            int op2 = lcs(s.substring(1), t);
//            int op3 = lcs(s.substring(1), t.substring(1));
//            return Math.max(op1, Math.max(op2, op3)); // op3 is not necessary
            return Math.max(op1, op2);
        }
    }

    public static int lcsM(String s, String t) {
        int[][] storage = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                storage[i][j] = -1;
            }
        }
        return lcsM(s, t, storage);
    }

    private static int lcsM(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();

        if(storage[m][n] != -1) {
            return storage[m][n];
        }
        if(m == 0 || n == 0) {
            storage[m][n] = 0;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)) {
            storage[m][n] = 1 + lcsM(s.substring(1), t.substring(1), storage);
        } else {
            int op1 = lcsM(s, t.substring(1), storage);
            int op2 = lcsM(s.substring(1), t, storage);
            storage[m][n] = Math.max(op1, op2);
        }
        return storage[m][n];
    }

    public static int lcsDP(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] storage = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++) {
            storage[i][0] = 0;
        }
        for(int i = 0; i <= n; i++) {
            storage[0][i] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s.charAt(m - i) == t.charAt(n - j)) {
                    storage[i][j] = 1 + storage[i - 1][j - 1];
                } else {
                    storage[i][j] = Math.max(storage[i][j - 1], storage[i - 1][j]);
                }
            }
        }
        return storage[m][n];
    }

    public static void main(String[] args) {
        String s = "adgeighghghghghghghghghgiuius";
        String t = "abegighghghghghghghghghgoughf";
        System.out.println("LCSDP : " + lcsDP(s, t));
        System.out.println("LCSM : " + lcsM(s, t));
        System.out.println("LCS : " + lcs(s, t));
    }
}
