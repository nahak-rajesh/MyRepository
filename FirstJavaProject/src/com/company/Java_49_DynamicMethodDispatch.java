package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am...");
    }
    public void on(){
        System.out.println("On Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    @Override
    public void on(){
        System.out.println("On SmartPhone...");
    }
}
public class Java_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        //Phone obj = new Phone(); //Allowed
        //SmartPhone sone = new SmartPhone(); //Allowed
        //obj.on();

        Phone obj = new SmartPhone(); // Reference SuperClass and Object SubClass
        obj.showTime();
        obj.on();

        //obj.music(); //Not allowed
    }
}
