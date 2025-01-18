package com.company;

class Circle2{
    public int radius;
    Circle2(int r){
        System.out.println("I am circle parameterised constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder1 extends Circle2{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }

}
public class Java_52_ch10ps {
    public static void main(String[] args) {
        // Problem 1
        //Circle2 obj = new Circle2(12);
        Cylinder1 obj = new Cylinder1(5,6);
    }
}
