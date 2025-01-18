package com.company;
//Question 1
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

//Question 2
class CellPhone{
  public void ring(){
      System.out.println("Ringing...");
  }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Swag...");
    }
}

//Question 3
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int periMeter() {
        return 4 * side;
    }
}

//Question 4
class Rectangle {
    int length;
    int width;

    public int area() {
        return length * width;
    }
    public int periMeter() {
        return 2 * (length + width);
    }
}

//Question 5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy!");
    }
    public void fire(){
        System.out.println("Firing the enemy!");
    }
    public void run(){
        System.out.println("Running from the enemy!");
    }
}

//Question 6
class Circle {
    float radius;
    public float area() {
        return 3.141f * radius * radius;
    }
    public float circumference() {
        return 2 * 3.141f * radius;
    }
    public float diameter(){
        return 2 * radius;
    }
}

public class Java_39_C8_Ps {
    public static void main(String[] args) {

        /*Question 1
        Employee1 r=new Employee1();
        r.setName("Rajesh");
        r.salary=33;
        System.out.println(r.getName());
        System.out.println(r.getSalary());
        */

        /*Question 1
        CellPhone vivo=new CellPhone();
        vivo.callFriend();
        vivo.vibrate();
        vivo.ring();
     */

        /*Question 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println("Area of the square:"+sq.area());
        System.out.println("Perimeter of the square:"+sq.periMeter());
        */

        /*Question 4
        Rectangle re = new Rectangle();
        re.length = 4;
        re.width = 3;
        System.out.println("Area of the Rectangle:"+re.area());
        System.out.println("Perimeter of the Rectangle:"+re.periMeter());
        */

        /*Question 5
        Tommy player1=new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
        */

        //Question 4
        Circle c = new Circle();
        c.radius = 4;
        System.out.println("Area of the circle:"+c.area());
        System.out.println("Perimeter of the circle:"+c.circumference());
        System.out.println("Diameter of the circle:"+c.diameter());
    }
}
