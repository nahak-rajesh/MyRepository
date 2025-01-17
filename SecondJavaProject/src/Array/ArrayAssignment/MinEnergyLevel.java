package Array.ArrayAssignment;
import java.util.Scanner;
public class MinEnergyLevel {

    public static int minEnergyLevel(int arr[], int x) {
        sort(arr);
        int p = avgArray(arr);
        int ind = index(arr, p);
        int c = 0;
        while (p != arr[arr.length - 1]) {
            for (int i = 0; i < arr.length; i++) {
                if (p >= arr[i]) {
                    c++;
                }
            }
            if (c == x)
                return p;
            else {
                ind++;
                p = arr[ind];
            }
        }
        return -1;
    }

    public static int index(int arr[], int avg) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == avg) {
                ans = i;
            }
        }
        return ans;
    }

    public static int avgArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


    public static void sort(int []arr){
        for(int i=0; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && arr[j]<temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int input[] = new int[N];
        for (int i = 0; i< input.length; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int animals[] = takeInput();
        System.out.println("Enter x :");
        int X = s.nextInt();
        int ans = minEnergyLevel(animals, X);
        System.out.println(ans);
    }
}
