package com.company;

// Problem 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Problem 2
class FountainPen extends Pen{
    public void write(){
        System.out.println("write...");
    }
    public void refill(){
        System.out.println("Refill...");
    }
    void changeNib(){
        System.out.println("Changing The Nib...");
    }
}

// Problem 3
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class Java_60_Ch11ps {
    public static void main(String[] args) {
        // Problem 1,2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Problem 3
        Human rajesh = new Human();
        rajesh.sleep();
        rajesh.jump();

        // Problem 5
        Monkey m = new Human();
        //m.speak(); error
        m.jump();
        m.bite();

        BasicAnimal lovish = new Human();
        //lovish.speak(); //error
        lovish.eat();
        lovish.sleep();
    }
}
