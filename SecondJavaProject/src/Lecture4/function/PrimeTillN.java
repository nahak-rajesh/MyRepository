package Lecture4.function;

import java.util.Scanner;

public class PrimeTillN {
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int n){
        if(n<=0){
            return;
        }
        for(int i=2; i<n; i++){
            boolean isPrime = isPrime(i);
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimes(n);
    }
}