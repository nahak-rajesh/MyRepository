package priorityQueues.Assignment;

public class CheckMaxHeap {

    public static boolean isMaxHeap(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (2 * i + 1 < arr.length && arr[i] < arr[2 * i + 1]) {
                return false;
            }
            if (2 * i + 2 < arr.length && arr[i] < arr[2 * i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 5, 4, 3, 2, 1};
        System.out.println("isMaxHeap : " + isMaxHeap(arr));
    }
}
