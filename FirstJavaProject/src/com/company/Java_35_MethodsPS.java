package com.company;

public class Java_35_MethodsPS {

    //Question 1 Multiplication Table
    static void multiTable(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }
    }

    //Question 2 Star pattern1
    static void StarPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                   System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Question 3 Sum of n Natural no by recursion
    static int sum(int n){
        if(n==1)
            return 1;
        else
            return sum(n-1)+n;
    }

    //Question 4 Star pattern2
    static void StarPattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                    System.out.print("*");
            }
            System.out.println("");
        }
    }

    //Question 5 Fibonacci Series
    static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        } else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    //Question 6 find avg
    static int avg(int...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum/arr.length;
    }

    //Question 7 Question 4 using Recursion
    static void SPattern1(int n){
        if(n>0){
            SPattern2(n-1);
        }
        for(int i=0;i<n;i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    //Question 8 Question 2 using Recursion
    static void SPattern2(int n){
        if(n>0){
            SPattern2(n-1);
        }
        for(int i=0;i<n;i++) {
            System.out.print("*");
        }
            System.out.println("");
    }

    //Question 9 C to F
    static float temp(float c){
        float f=(c*9/5)+32;
        return f;
    }
    public static void main(String[] args) {
        //Question 1 Multiplication Table
        //multiTable(5);

        //Question 2 Star pattern1
        //StarPattern1(5);

        //Question 3 Sum of n Natural no by recursion
        //System.out.println("Sum Of N-natural no:"+sum(5));

        //Question 4 Star pattern2
        //StarPattern2(5);

        /*Question 5 Fibonacci Series
        int n=5;
        for(int i=0;i<n;i++) {
            System.out.println(Fibonacci(i));
        */

        //Question 6 find avg
        //System.out.println("Avg:"+avg(1,2,3,4,5));

        //Question 7 Question 4 using Recursion
        //SPattern1(5);

        //Question 8 Question 2 using Recursion
        //SPattern2(5);

        //Question 9 C to F
        float c=5.5f;
        System.out.format("%fC=%fF",c,temp(c));
    }
}
