package OOPS.OOPS3.generics.genericMethods;

public class Print {
    public static<T> void print (T arr[]) {
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 11;
        }
        print(arr);

        String str[] = new String[10];
        for (int i = 0; i < arr.length; i++) {
            str[i] = "abc";
        }
        print(str);
    }
}
