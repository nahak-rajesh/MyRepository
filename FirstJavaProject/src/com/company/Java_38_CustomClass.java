package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is :"+id);
        System.out.println("My name is :"+ name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Java_38_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee rajesh=new Employee(); //Instantiating a new Employee Object

        // Setting Attributes for Rajesh
        rajesh.id=33;
        rajesh.salary=34;
        rajesh.name="Rajesh Nahak";
        //System.out.println(rajesh.id);
        //System.out.println(rajesh.name);
        rajesh.printDetails();
        int salary=rajesh.getSalary();
        System.out.println(salary);

        // Setting Attributes for Swagatika
        Employee swagatika=new Employee();
        swagatika.id=32;
        swagatika.salary=12;
        swagatika.name="Swagatika Padhi";
        swagatika.printDetails();
    }
}
