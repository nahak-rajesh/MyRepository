package OOPS.classes_objects;

import java.util.Scanner;

public class ComplexNumClass {
    int real;
    int imaginary;

    public ComplexNumClass (int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        if (this.imaginary > 0){
            System.out.println(this.real + " + " + "i" + this.imaginary);
        } else {
            System.out.println(this.real + " - "+ "i" + -this.imaginary);
        }
    }

    public static ComplexNumClass plus(ComplexNumClass c1, ComplexNumClass c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumClass c = new ComplexNumClass(newReal, newImaginary);
        return c;
    }

    public static ComplexNumClass multiply(ComplexNumClass c1, ComplexNumClass c2) {
        int newReal = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int newImaginary = c1.real * c2.imaginary + c1.imaginary * c2.real;
        ComplexNumClass c = new ComplexNumClass(newReal, newImaginary);
        return c;
    }
}

class ComplexNumClassUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        ComplexNumClass c1 = new ComplexNumClass(real1, imaginary1);

        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        ComplexNumClass c2 = new ComplexNumClass(real2, imaginary2);

        int choice = sc.nextInt();
        if (choice == 1){
            ComplexNumClass c3 = ComplexNumClass.plus(c1, c2);
            c3.print();
        } else if (choice == 2) {
            ComplexNumClass c4 = ComplexNumClass.multiply(c1, c2);
            c4.print();
        } else {
            System.out.println("Default Choice");
        }
    }
}