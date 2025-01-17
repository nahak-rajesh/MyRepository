package Recursion.Recursion1;

public class SumOfArray {
    public static int sumArray(int input[]) {
        if (input.length == 0)
            return 0;
        int smallArr[] = new int[input.length - 1];
        for (int i=1; i<input.length; i++) {
            smallArr[i - 1] = input[i];
        }
        return input[0] + sumArray(smallArr);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1};
        System.out.println(sumArray(arr));
    }
}
