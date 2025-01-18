package com.company;

public class Java_34_Recursion {
    //Fibonacci Series!!
    static int fibonacci(int n){
            if (n == 0 || n == 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
    }
    //Factorial!!
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        //Factorial
        //int n=4;
        //System.out.println("The value of factorial n is :"+ factorial(n) );

        //Fibonacci
        int n=10;
        System.out.println("Fibonacci series:");
        for(int i=0;i<n;i++) {
            System.out.println(fibonacci(i));
        }
    }
}
