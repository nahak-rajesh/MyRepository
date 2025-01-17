package Recursion.Recursion2a;

public class PrintSubSetOfArray {
    public static void display(int arr[]) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printSubSet(int input[], int sI, int output[]) {
        if(sI >= input.length - 1){
            display(output);
            return;
        }
        printSubSet(input, sI + 1, output);
        int newOnput[] = new int[output.length + 1];
        int j = 0;
        for (; j < output.length; j++) {
            newOnput[j] = output[j];
        }
        newOnput[j] = input[sI];
        printSubSet(input, sI + 1, newOnput);
    }
    public static void printSubSet(int arr[]) {
        int output[] = new int[0];
        printSubSet(arr, 0, output);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        printSubSet(arr);
    }
}
