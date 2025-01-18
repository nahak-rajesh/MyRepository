package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<10) {
            System.out.println("I am a Thread.");
            i++;
        }
    }
}
public class Java_73_Thread_Constructor {
    public static void main(String[] args) {
        MyThr r = new MyThr("Rajesh");
        r.start();
        System.out.println("The ID of the Thread is :"+r.getId());
        System.out.println("The Name of the Thread is :"+r.getName());

        MyThr s = new MyThr("Swag");
        s.start();
        System.out.println("The ID of the Thread is :"+s.getId());
        System.out.println("The Name of the Thread is :"+s.getName());

    }
}
