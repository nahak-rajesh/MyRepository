package Recursion.Recursion1;

public class CheckNumRecursively {
    public static boolean checkNum(int input[], int n) {
        if (input.length <= 1){
            if (input[0] == n)
                return true;
            else
                return false;
        }
        int smallArr[] = new int[input.length - 1];
        for (int i=1; i<input.length; i++) {
            smallArr[i - 1] = input[i];
        }
         return checkNum(smallArr,n);
    }
    public static void main(String[] args) {
        int arr[] = {3, 9, 8};
        System.out.println(checkNum(arr, 8));
    }
}
