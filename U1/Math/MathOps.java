package U1.Math;

public class MathOps{
    public static void main (String[] args) {
        int x = 5;
        int y = 8;
        double m = 6.25;
        System.out.println(x + " " + y + " " + m);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println((double)x/y);
        System.out.println("x+y is " + x + y);
        System.out.println("x+y is " + (x+y));
        System.out.println("x*m is " + x*m);
        System.out.println("average");
        System.out.println(x+y/2);
        System.out.println((x+y)/2);
        System.out.println((x+y)/2.0);

        //remainder operators
        System.out.println("Remainders modulus operator");
        System.out.println(8/5);
        System.out.println(8%5);
        System.out.println(5/8);
        System.out.println(5%8);

        //PEMDAS - %operator has same precidence as MD
        double a = 7+3%5/2 +6%(5-2);
        System.out.println(a);
        int b = 6*5%12;
        System.out.println(b);

        System.out.println("mixing numbers with strings");
        System.out.println(1+2+3 + " Hello");

        //increment  operations
        int c = 6;
        int d = 8;
        c = c+2;
        d = d-3;
        System.out.println(c + " " + d);
        c += 2;
        d -= 3;
        System.out.println(c + " " + d);
        c++;
        d--;
        System.out.println(c + " " + d);
    }
}