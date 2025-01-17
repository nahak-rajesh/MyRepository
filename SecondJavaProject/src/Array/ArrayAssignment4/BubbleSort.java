package Array.ArrayAssignment4;

public class BubbleSort {

    public static void sort(int []arr){
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {8,2,6,1,5};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
