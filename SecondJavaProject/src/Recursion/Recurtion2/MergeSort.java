package Recursion.Recurtion2;

public class MergeSort {

    public static void sort(int []arr, int sI, int eI) {
        if (sI >= eI)
            return;
        int mid = (sI + eI) / 2;
        sort(arr, sI, mid);
        sort(arr, mid + 1, eI);
        merge(arr, sI, eI);
    }

    public static void merge(int []arr, int sI, int eI) {
        int mid = (sI + eI) / 2;
        int []ans = new int[eI - sI + 1];
        int i = sI;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= eI) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= eI) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int index=0; index< ans.length; index++) {
            arr[sI + index] = ans[index];
        }
    }

    public static void main(String[] args) {
        int []arr = {5,2,8,9,1};
        sort(arr, 0, arr.length - 1);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
