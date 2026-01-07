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
        for (int i = 3; e-eold >= 0.001; i++) {
            e += Math.pow(x,i)/calcFactorial(i);
            eold += Math.pow(x,i-1)/calcFactorial(i-1);
        }
        return e;
    }

    public static void main(String[] args) {
        for (int k = 1; k <= 20; k++) {
            System.out.println(k + "! = " + calcFactorial(k));
        }

        for (int k = 1; k <= 5; k++) {
            System.out.printf("e is %2.3f \n", calcEX(k));
        }

        System.out.println(calcE());

    }
}

// 1! = 1
// 2! = 2
// 3! = 6
// 4! = 24
// 5! = 120
// 6! = 720
// 7! = 5040
// 8! = 40320
// 9! = 362880
// 10! = 3628800
// 11! = 39916800
// 12! = 479001600
// 13! = 6227020800
// 14! = 87178291200
// 15! = 1307674368000
// 16! = 20922789888000
// 17! = 355687428096000
// 18! = 6402373705728000
// 19! = 121645100408832000
// 20! = 2432902008176640000
// e is 2.718 
// e is 7.389 
// e is 20.085 
// e is 54.598 
// e is 148.413 
// 2.7182539682539684
