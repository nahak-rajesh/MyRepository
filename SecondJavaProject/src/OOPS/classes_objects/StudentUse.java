package OOPS.classes_objects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Raj",4);
        System.out.println(s1);
//        s1.name = "Rajesh";
//        s1.rollNo = 1;
//        s1.setRollNo(1);
        s1.print();
        Student s2 = new Student("Swag",3);
        System.out.println(s2);
//        s2.name = "Swag";
//        s2.rollNo = 2;
//        s2.setRollNo(-2);
//        System.out.println(s1);
//        System.out.println(s1.name);
//        System.out.println(s1.getRollNo());
//        System.out.println(s2.getRollNo());
        s2.print();

        Student s3 = new Student("Asi");
        s3.print();
//        System.out.println(s2.numStudent);
//        System.out.println(s1.numStudent);
//        we can access numStudent by the class because it is independent of obj
//        System.out.println(Student.numStudent);
    }
}
