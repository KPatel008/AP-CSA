public class Factorial {
    public static long calcFactorial(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static double calcE() {
        double e = 1 + 1.0/calcFactorial(2) + 1.0/calcFactorial(1);
        double eold = 1 + 1.0/calcFactorial(1);
        int a = 3;
        while (e - eold >= 0.001) {
            e += 1.0/calcFactorial(a);
            eold += 1.0/calcFactorial(a-1);
            a++;
        }
        return e;
    }

    public static double calcEX(int x) {
        double e = 1 + Math.pow(x,2)/calcFactorial(2) + x/calcFactorial(1);
        double eold = 1 + x/calcFactorial(1);
        int a = 3;
        while (e - eold >= 0.001) {
            e += Math.pow(x, a)/calcFactorial(a);
            e += Math.pow(x, a-1)/calcFactorial(a-1);
            a++;
        }
        return e;
    }

    public static void main(String[] args) {
        for (int k = 1; k <= 20; k++) {
            System.out.println(k + "! = " + calcFactorial(k));
            System.out.printf("e is %2.3f \n", calcEX(3));
        }

        System.out.println(calcE());

        
    }
}
