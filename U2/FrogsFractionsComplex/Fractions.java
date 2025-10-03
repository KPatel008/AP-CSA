package U2.FrogsFractionsComplex;

public class Fractions {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fractions(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
    public Fractions() {
        numerator = 1;
        denominator = 1;
    }
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fractions add(Fractions other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fractions result = new Fractions(n,d);
		return result;
	}
	
	public Fractions subtract(Fractions other) {
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator * other.denominator;

        Fractions result = new Fractions(n,d);
        return result;
    }
	
	public Fractions multiply(Fractions other) {
        int n = this.numerator*other.numerator;
        int d = this.denominator*other.denominator;

        Fractions result = new Fractions(n,d);
        return result;
    }
	
	
    public String toString() {
        String s = numerator +"/" + denominator;
        return s;
    }
	
	public Fractions reciprocal() {
        int n = this.denominator;
        int d = this.numerator;

        Fractions result = new Fractions(n,d);
        return result;
    }
	
	
	public static void main(String[] args) {
		Fractions f1 = new Fractions(3,4);	// create an instance of fraction
		Fractions f2 = new Fractions(4,5);	
		
		Fractions f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		Fractions f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		Fractions f5 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + f5);
		
		Fractions f6 = f1.reciprocal();
        System.out.println(f6);
		
		//create 2 new fractions and add them here.
		Fractions f7 = new Fractions(6,7);
        Fractions f8 = new Fractions(4,1);

        Fractions f9 = f7.add(f8);
        System.out.println(f9);
	}

}

// 3/4 + 4/5 = 31/20
// 3/4 - 4/5 = -1/20
// 3/4 * 4/5 = 12/20
// 4/3
// 34/7
