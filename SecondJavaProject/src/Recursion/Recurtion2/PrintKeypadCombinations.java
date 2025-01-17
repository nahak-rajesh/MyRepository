package Recursion.Recurtion2;

import java.util.Scanner;

public class PrintKeypadCombinations {

    public static void printKeypad(int n) {
        printKeypad(n, " ");
    }

    public static void printKeypad(int n, String outputSoFar) {
        if (n == 0) {
            System.out.println(outputSoFar);
            return;
        }
        int r = n % 10;
        char []helperArray = helper(r);
        for (int i=0; i<helperArray.length; i++)
            printKeypad(n / 10, helperArray[i] + outputSoFar);
    }

    public static char[] helper(int n) {
        char hel[] = switch (n) {
            case 2 -> new char[]{'a', 'b', 'c'};
            case 3 -> new char[]{'d', 'e', 'f'};
            case 4 -> new char[]{'g', 'h', 'i'};
            case 5 -> new char[]{'j', 'k', 'l'};
            case 6 -> new char[]{'m', 'n', 'o'};
            case 7 -> new char[]{'p', 'q', 'r'};
            case 8 -> new char[]{'s', 't', 'u', 'v'};
            case 9 -> new char[]{'w', 'x', 'y', 'z'};
            default -> new char[]{};
        };
        return hel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printKeypad(n);
    }
}
