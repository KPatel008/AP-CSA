package U1.FrogsFractionsComplex;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    public Complex(double r) {
        real = r;
        imaginary = 0.0;
    }

    public String toString() {
        String s = real + " + " + imaginary +"i";
        return s;
    }

    public Complex add(Complex c) {
        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        Complex result = new Complex(r,i);
        return result;
    }

    public Complex multiply(Complex other) {
        double r = (this.real*other.real) + (this.imaginary*other.imaginary*-1);
        double i = (this.real*other.imaginary) + (this.imaginary*other.real);

        Complex result = new Complex(r, i);
        return result;
    }

    public Complex add(double a) {
        double r = this.real + a;
        double i = this.imaginary;
    }


}
