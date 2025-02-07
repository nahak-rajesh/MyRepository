package Array.ArrayAssignment4;

public class MergeSort {

    public static int[] sort(int []arr1, int []arr2){
        int []arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr2.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int []arr1 = {2,3,5,7};
        int []arr2 = {1,4,6};
        int []arr3 = sort(arr1,arr2);
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
