package DP_2;

public class ArrayRotate {

    public static void rotate(int[] arr, int k) {
        while(k > 0) {
            int temp = arr[arr.length - 1];
            for(int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
       rotate(arr, 4);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
    }
}
