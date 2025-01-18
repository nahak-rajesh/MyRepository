package com.company;

interface MyCamera{
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
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera , MyWifi{
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
public class Java_57_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        //ms.greet();//Throws an error
        ms.record4kVideo();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
