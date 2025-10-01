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

        Complex result = new Complex(r,i);
        return result;
    }

    public Complex multiply(double a) {
        double r = this.real * a;
        double i = this.imaginary * a;

        Complex result = new Complex(r,i);
        return result;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2,-3);
        Complex c2 = new Complex(4,5);
        Complex c3 = new Complex(6);
        Complex c4 = new Complex(-7,8);
        Complex c5 = new Complex(0,2);
        Complex c6 = new Complex(3,0);

        Complex c7 = c1.add(c2);
        System.out.println(c7);
        Complex c8 = c3.multiply(c4);
        System.out.println(c8);
        Complex c9 = c5.add(3);
        System.out.println(c9);
        Complex c10 = c6.multiply(4);
        System.out.println(c10);
    }


}

// 6.0 + 2.0i
// -42.0 + 48.0i
// 3.0 + 2.0i   
// 12.0 + 0.0i  
