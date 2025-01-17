package OOPS.classes_objects;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber (int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void print() {
        if (this.imaginary > 0){
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real + " - " + -this.imaginary + "i");
        }
    }

    public void add(ComplexNumber c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void multiply(ComplexNumber c) {
        int temp = this.real;
        this.real = this.real * c.real - this.imaginary * c.imaginary;
        this.imaginary *= temp * c.imaginary + this.imaginary * c.real;
    }

    public ComplexNumber conjugate(){
        ComplexNumber c = new ComplexNumber(this.real, -this.imaginary);
        return c;
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c = new ComplexNumber(newReal, newImaginary);
        return c;
    }
}
