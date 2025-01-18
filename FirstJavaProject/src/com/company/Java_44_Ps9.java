package com.company;

//Problem 1,2,3
class Cylinder{
    private float radius;
    private float height;

    //Constructor
    public Cylinder(float radius,float height){
        this.radius=radius;
        this.height=height;
    }
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * 3.141 * radius * radius + 2 * 3.141 * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

// Problem 4
class Rectangle1{
    private int length;
    private int breadth;
    public Rectangle1(){
        this.length=4;
        this.breadth=5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle1(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }
}

// Problem 5
class Circle1{
    private int radius;

    public Circle1(){
        this.radius=6;
    }
    public Circle1(int radius){
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double diameter(){
        return 2 * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
public class Java_44_Ps9 {
    public static void main(String[] args) {
        /*
        // Problem 1
        private float radius;
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println("Cylinder Height : " + myCylinder.getHeight());
        myCylinder.setRadius(10);
        System.out.println("Cylinder Radius : " + myCylinder.getRadius());
         // Problem 2
        System.out.println("Cylinder SurfaceArea : " + myCylinder.surfaceArea());
        System.out.println("Cylinder Volume : " + myCylinder.volume());
        */

        /* Problem 3
        Cylinder myCylinder = new Cylinder(12,9);
        System.out.println("Cylinder Height : " + myCylinder.getHeight());
        System.out.println("Cylinder Radius : " + myCylinder.getRadius());
        System.out.println("Cylinder SurfaceArea : " + myCylinder.surfaceArea());
        System.out.println("Cylinder Volume : " + myCylinder.volume());
        */

        /* Problem 4
        Rectangle1 r = new Rectangle1();
        System.out.println("Rectangle length : " + r.getLength());
        System.out.println("Rectangle Breadth : " + r.getBreadth());
        System.out.println("Rectangle area : " + r.area());
        System.out.println("Rectangle perimeter : " + r.perimeter());
        */

        // Problem 4
        //Circle1 c = new Circle1(5);
        Circle1 c = new Circle1();
        //c.setRadius(5);
        System.out.println("Circle Radius : " + c.getRadius());
        System.out.println("Circle Area : " + c.area());
        System.out.println("Circle Diameter : " + c.diameter());
        System.out.println("Circle Circumference : " + c.circumference());
    }
}
