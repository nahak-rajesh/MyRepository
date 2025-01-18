package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Base Class Constructor");
    }
    Base1(int x){
        System.out.println("I am a Overloading Base Class Constructor with value x :" + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am a Derived Class Constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am a Overloading Derived Class Constructor with value y :" + y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a ChildOfDerived Class Constructor");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a ChildOfDerived Class Constructor with value z :" + z);
    }
}
public class Java_46_Constructors_In_Inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(3,4);
        //ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(3,4,5);
    }
}
