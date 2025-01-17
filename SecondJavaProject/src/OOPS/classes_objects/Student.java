package OOPS.classes_objects;

public class Student {
    public String name;
//    final data members can be initialized as soon as they are declared or with in a constructor
//    private final int rollNo; // declared
    private int rollNo;
//    static properties or methods are independent of obj, depend upon class
    private static int numStudent;
    public static int getNumStudent(){
        return numStudent;
    }

    // constructor
    public Student(String n){
        name = n;
//        rollNo = 6;
    }

//    just like an object this is a reference to the class or which access data members which has same name as a local variable
    public Student(String name, int rollNo){
        System.out.println(this);
        this.name = name;
        this.rollNo = rollNo;
        numStudent++;
    }

//    for private, we add some functionalities
//    public void setRollNo(int rn){
//        if(rn <= 0)
//            return;
//        rollNo = rn;
//    }
    public int getRollNo() {
        return rollNo;
    }
    public void print(){
        System.out.println(name + " : " + rollNo);
    }
}

