package WhileLoops;
public class WhileLoops {
    public static int addOdds(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i%2 != 0) {sum += i;}
            i++;
        }
        return sum;
    }

    public static int sumDigits(int a) {
        int sum = 0;
        int rem = 10;
        int div = 1;
        while (div <= a) {
            sum += (a%rem)/div;
            rem *= 10;
            div *= 10;
        }
        return sum;
    }

    public static int howManyYears(double startpop, double endpop) {
        double rate = 1.0113;
        int years = 0;
        while (startpop < endpop) {
            startpop *= rate;
            years++;
        }
        return years;
    }

    public static void printSum(int n) {
        int sum = 0;
        int i = 0;
        System.out.println("n = " + n);
        while (i <= n) {
            sum += i;
            if (i == 0) {System.out.print("");}
            else if (i < n) {System.out.print("" + i + " + ");}
            else {System.out.print("" + i + " ");}
            i++;
        }
        System.out.print("= " + sum);
        System.out.println("");
        
    }

    public static boolean isPerfectSquare(int n) {
        int i = 1;
        int sum = 0;
        while (sum < n) {
            sum += i;
            i += 2;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println("addOdds");
        System.out.println(addOdds(5));
        System.out.println(addOdds(20));
        System.out.println(addOdds(11));

        System.out.println("");

        System.out.println("sumDigits");
        System.out.println(sumDigits(13));
        System.out.println(sumDigits(600));
        System.out.println(sumDigits(412));

        System.out.println("");

        System.out.println("howManyYears");
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));

        System.out.println("");
        
        System.out.println("printSum");
        printSum(6);
        printSum(8);
        printSum(3);

        System.out.println("");

        System.out.println("isPerfectSquare");
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(49));
        System.out.println(isPerfectSquare(37));
        System.out.println(isPerfectSquare(50));
    }
}

// addOdds
// 9
// 100
// 36

// sumDigits
// 4
// 6
// 7

// howManyYears
// 7
// 27

// printSum
// n = 6
// 1 + 2 + 3 + 4 + 5 + 6 = 21
// n = 8
// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
// n = 3
// 1 + 2 + 3 = 6

// isPerfectSquare
// true
// true
// false
// false
