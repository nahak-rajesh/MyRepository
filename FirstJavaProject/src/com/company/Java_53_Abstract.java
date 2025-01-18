package com.company;

 abstract class Parent{
    public Parent(){
        System.out.println("I am base2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child extends Parent{
     @Override
     public void greet(){
         System.out.println("Good Morning");
     }
}
abstract class Child1 extends Parent{
     public void th(){
         System.out.println("I am Good");
     }
}
public class Java_53_Abstract {
    public static void main(String[] args) {
        Child c = new Child();
       // Parent p = new Parent(); //Error
       // Child1 c1 = new Child1(); //Error
    }
}
