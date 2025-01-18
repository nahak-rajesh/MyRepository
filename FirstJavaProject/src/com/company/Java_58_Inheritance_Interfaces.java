package com.company;

interface SampleInterFace{
    void meth1();
    void meth2();
}
interface ChildSampleInterFace extends SampleInterFace{
        void meth3();
        void meth4();
}
class MySampleClass implements ChildSampleInterFace{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}
public class Java_58_Inheritance_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
