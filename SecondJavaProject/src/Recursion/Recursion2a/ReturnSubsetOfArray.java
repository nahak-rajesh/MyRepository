package Recursion.Recursion2a;

public class ReturnSubsetOfArray {

    public static int[][] returnSubset(int []arr, int sI) {
        if (sI >= arr.length) {
            int ans[][] = new int[1][0];
            return ans;
        }
        int [][]smallAns = returnSubset(arr, sI + 1);
        int [][]ans = new int[smallAns.length * 2][];
        int k = 0;
        for (int i = 0; i < smallAns.length; i++) {
            ans[i] = new int[smallAns[i].length];
            for (int j = 1; j < smallAns[i].length; j++) {
                ans[i][j] = smallAns[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallAns.length; i++) {
            ans[k + i] = new int[smallAns[i].length + 1];
            ans[k + i][0] = arr[sI];
            for (int j = 1; j <= smallAns[i].length; j++) {
                ans[k + i][j] = smallAns[i][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int ans[][] = returnSubset(arr,0);
        for (int i=0; i<ans.length; i++) {
            for (int j=0; j<ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
