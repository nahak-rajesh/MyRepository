package Array.ArrayAssignment4;

public class SelectionSort {
    public static void sort(int []arr){
        int size = arr.length;
        for(int i=0; i<size-1; i++){
            int min = arr[i];
            int index = i;
            for(int j=i+1; j<size; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if(index != i){
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void display(int []arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int []arr = {2,6,9,1,5};
        sort(arr);
        display(arr);
    }
}
