package Recursion.Recurtion2;

public class QuickSort {

    public static void quickSort(int []arr, int sI, int eI) {
        if (sI >= eI)
            return;
        int pivotPos = partition(arr, sI, eI);
        quickSort(arr, sI, pivotPos - 1);
        quickSort(arr, pivotPos + 1, eI);
    }

    public static void swap(int []arr, int sourceIndex, int destinationIndex) {
        int temp = arr[sourceIndex];
        arr[sourceIndex] = arr[destinationIndex];
        arr[destinationIndex] = temp;
    }
    public static int partition(int []arr, int sI, int eI) {
        int pivot = arr[sI];
        int count = 0;
        for (int i=sI+1; i<=eI; i++) {
           if (arr[i] <= pivot)
               count++;
        }
        int pivotPos = count + sI;
        swap(arr, sI, pivotPos);
        int i = sI;
        int j = eI;
        while (i<pivotPos && j>pivotPos) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
               swap(arr, i, j);
               i++;
               j--;
           }
       }
       return pivotPos;
    }

    public static void main(String[] args) {
        int []arr = {2, 6, 8, 5, 6, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
