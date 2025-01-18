package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Java_45_Inheritance {
    public static void main(String[] args) {
        // Creating an object of Base Class
        Base b = new Base();
        b.setX(4);
        System.out.println("Value of x : " + b.getX());

        // Creating an object of Derived Class
        Derived d = new Derived();
        d.setX(6);
        System.out.println("Value of x : " + d.getX());

        d.setY(8);
        System.out.println("Value of y : " + d.getY());
    }
}
