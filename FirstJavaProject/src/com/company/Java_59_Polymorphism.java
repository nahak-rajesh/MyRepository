package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k Video...");
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2 , MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Video Recording");
    }
    //    public void record4kVideo(){
//        System.out.println("Recording Snap with 4k Video......");
//    }
    public String [] getNetworks(){
        System.out.println("Getting List of networks");
        String [] networkList = {"Rajesh" , "Harry" , "Prashant"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to" + network);
    }
}
public class Java_59_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
        // cam1.getNetworks(); -->> not allowed
        cam1.record4kVideo();
        MySmartPhone2 s = new MySmartPhone2();
        s.recordVideo();
        s.takeSnap();
    }
}
