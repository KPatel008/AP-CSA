package U1.Math;

public class RandomMath {
    public static void main(String[] args) {
        /* Using the built in Math class */
        int a = 7;
        int b = 23;
        System.out.println(Math.abs(b-a));
        double c = 4.5;
        double d = 8.3;
        System.out.println(Math.abs(c-d));
        double e = Math.abs(c-d);
        System.out.println(e);

        //using pow()
        double x = 4.5;
        double y = Math.pow(x,2);
        System.out.println(y);
        double z = Math.sqrt(y);
        System.out.println(z);

        //random numbers
        double g = Math.random();
        System.out.println(g);
        double h = Math.random()*10;
        System.out.println(h);
        int j = (int)(Math.random()*10)+1;
        System.out.println(j);
    }
}
