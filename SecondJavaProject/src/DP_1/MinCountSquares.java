package DP_1;

public class MinCountSquares {

    public static int countSquares(int n) {
        if(n == 0)
            return 0;
        int minCount = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; i++) {
            int count = 1 + countSquares(n - i * i);
            if(count < minCount)
                minCount = count;
        }
        return minCount;
    }

    public static int countSquaresM(int n) {
        int storage[] = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            storage[i] = -1;
        }
        return countSquaresM(n, storage);
    }

    private static int countSquaresM(int n, int[] storage) {
        if(n == 0) {
            return 0;
        }
        if(storage[n] != -1) {
            return storage[n];
        }
        int minCount = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; i++) {
            int count = 1 + countSquaresM(n - i * i, storage);
            minCount = Math.min(minCount, count);
        }
        storage[n] = minCount;
        return storage[n];
    }

    public static int countSquaresDP(int n) {
        int[] storage = new int[n + 1];
        storage[0] = 0;
        for(int i = 1; i <= n; i++) {
            int minCount = Integer.MAX_VALUE;
            for (int j = 0; j * j <= i; j++) {
                minCount = Math.min(minCount, 1 + storage[i - j * j]);
            }
            storage[i] = minCount;
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 64;
        System.out.println("countSquaresDP : " + countSquaresDP(n));
        System.out.println("countSquaresM : " + countSquaresM(n));
        System.out.println("countSquares : " + countSquares(n));
    }
}
