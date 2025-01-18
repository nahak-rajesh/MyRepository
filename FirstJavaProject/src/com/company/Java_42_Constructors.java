package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-name-here";
    }
    public MyMainEmployee(String myname,int myid){
        id = myid;
        name = myname;
    }
    public void setName(String n){ name = n; }
    public String getName(){ return name; }
    public void setId(int i){ id = i; }
    public int getId(){ return id; }
}
public class Java_42_Constructors {
    public static void main(String[] args) {
        //MyMainEmployee e1 = new MyMainEmployee("Asima",333);
        MyMainEmployee e1 = new MyMainEmployee();
        //e1.setName("Swagatika");
        //e1.setId(32);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
