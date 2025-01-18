package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class Java_40_Ch9 {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();
        //e1.id=30;
        //e1.name="Rajesh"; -->> Throws an error due to access modifier.
        e1.setName("Rajesh");
        System.out.println("Employee Name : " + e1.getName());
        e1.setId(33);
        System.out.println("Employee Id : " + e1.getId());
    }
}
