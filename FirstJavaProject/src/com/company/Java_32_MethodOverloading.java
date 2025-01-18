package com.company;

public class Java_32_MethodOverloading {
    static void foo(){
        System.out.println("Good morning!");
    }
    static void foo(int a){
        System.out.println("Good morning!"+a);
    }static void foo(int a,int b){
        System.out.println("Good" +b+ " morning!"+a);
    }

    /*static void change2(int [] arr ){
        arr [0]=98;
    }
    static void tellJock(){
        System.out.println("I have invented a new word!\n" +
                "Plagiarism!");
    }
     */
    public static void main(String[] args) {
        /*tellJock();
        int [] marks={43,54,55,65,76};
        change2(marks);
        System.out.println("The value of x after changing is :"+marks[0]);
         */
        foo();
        foo(3);
        foo(5,6);
    }
}
