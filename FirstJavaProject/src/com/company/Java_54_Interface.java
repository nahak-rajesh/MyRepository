package com.company;

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornK3g(int decrement);
    void blowHornMhn(int increment);
}
class AvonCycle implements Bicycle , HornBicycle {
    void blowHorn(){
        System.out.println("Pee Pee Pee");
    }
   public void applyBreak(int decrement){
       System.out.println("Apply Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying Speed");
    }
    public void blowHornK3g(int decrement){
        System.out.println("Kabhi Khusi Kabhi Gum pee pee pee");
    }
    public void blowHornMhn(int increment){
        System.out.println("Main Hoon Na poo poo poo");
    }
}
public class Java_54_Interface {
    public static void main(String[] args) {
        AvonCycle cycleRajesh = new AvonCycle();
        cycleRajesh.applyBreak(0);
        // U can Create properties in Interfaces but cant modify it
        System.out.println(cycleRajesh.a);
        //cycleRajesh.a=30; //cant modify
        cycleRajesh.blowHornK3g(4);
        cycleRajesh.blowHornMhn(5);
    }
}
