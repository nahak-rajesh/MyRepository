package OOPS.classes_objects;

public class Polynomial {
    DynamicArray coefficients;

    public Polynomial() {
        coefficients = new DynamicArray();
    }

    public void setCoefficients(int deg, int coeff) {
        coefficients.set(deg, coeff);
    }

    public int getCoefficients(int deg) {
        return coefficients.get(deg);
    }

    public int degree() {
        return coefficients.size() - 1;
    }

    public void print() {
        for (int i=0; i<coefficients.size() - 1; i++){
            if (coefficients.get(i) != 0) {
                System.out.print(" + " + coefficients.get(i) + "x^" + i);
            }
        }
    }

    public void add(Polynomial p) {

    }
}
