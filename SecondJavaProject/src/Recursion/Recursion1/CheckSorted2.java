package Recursion.Recursion1;

public class CheckSorted2 {
    private static boolean checkSorted2(int []input) {
        if (input.length <= 1)
            return true;
        if (input[0] > input[1]) {
            return false;
        }
        int []smallInput = new int[input.length - 1];
        for (int i=1; i<input.length; i++) {
            smallInput [i-1] = input[i];
        }
        boolean smallAns = checkSorted2(smallInput);
        return smallAns;
    }
//  this function checks if the array is sorted from startIndex to end
    public static boolean checkSortedBetter(int input[], int startIndex) {
        if (startIndex >= input.length - 1) {
            return true;
        }
        if (input[startIndex] > input[startIndex + 1])
            return false;
        return checkSortedBetter(input, startIndex + 1);
    }
    public static boolean checkSortedBetter(int input[]) {
        return checkSortedBetter(input, 0);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 6, 9};
        System.out.println(checkSortedBetter(arr));
    }
}