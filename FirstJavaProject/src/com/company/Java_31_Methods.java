package com.company;

public class Java_31_Methods {
    //only static method can call static method.
    /*static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
     */
     int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c;
        //Method invocation using static.
        //c=logic(a,b);
        //Method invocation using object creation.
        Java_31_Methods obj=new Java_31_Methods();
        c=obj.logic(a,b);

        int a1=5;
        int b1=3;
        int c1;
        //Method invocation using static.
        //c1=logic(a1,b1);
        //Method invocation using object creation.
        c1=obj.logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
