package U7;

public class Stars {

    public static void printStars(int n) {
        if (n == 1) System.out.println("*");
        else {
            System.out.print("*");
            printStars(n - 1);
        }
    }

    public static void printTriangle1(int n) {
        if (n == 1) printStars(1);
        else {
            printTriangle1(n - 1);
            printStars(n);
        }
    }

    public static void printTriangle2(int n) {
        if (n == 1) printStars(1);
        else {
            printStars(n);
            printTriangle2(n - 1);
        }
    }

    public static void printNumbers(int n, int x) {
        if (x == 1) System.out.println(n);
        else {
            System.out.print(n);
            printNumbers(n, x - 1);
        }
    }

    public static void printNumberTriangle(int num) {
        if (num == 1) printNumbers(1,1);
        else {
            printNumberTriangle(num - 1);
            printNumbers(num, num);
        }
    }

    public static void printBackFor(int n) {
        if (n == 1) System.out.print(n);
        else {
            System.out.print(n);
            printBackFor(n - 1);
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        printStars(6);
        printStars(4);
        System.out.println();
        printTriangle1(5);
        System.out.println();
        printTriangle2(5);
        System.out.println();
        printNumbers(6, 6);
        System.out.println();
        printNumberTriangle(6);
        System.out.println();
        printBackFor(5);
    }
}