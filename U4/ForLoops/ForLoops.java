package ForLoops;

public class ForLoops {
    public static int addEvens(int n) {
        int i = 0;
        int sum = 0;
        for (i = 0; i <= n; i+= 2) {
            sum += i;
        }
        return sum;
    }

    public static void printSquaresBack(int n) {
        int i = 0;
        for (i = 0; n != i; n -= 1) {
            System.out.print((int) Math.pow(n,2));
            if (n > 1) {System.out.print(", ");}
            else {System.out.println("");}
        }
    }

    public static String reverse(String s) {
        String reversed = "";
        for (int b = s.length(); b >= 1; b--) {
            reversed += s.charAt(b-1);
        }
        return reversed;
    }

    public static String stutter(String s) {
        String stuttered = "";
        for (int a = 1; a <= s.length(); a++) {
            for (int b = 0; b <= 1; b++) {
                stuttered += s.charAt(a-1);
            }
        }
        return stuttered;
    }

    public static void sillyNumbers() {
        for (int a = 0; a < 3; a++) {
            for (int num = 0; num < 10; num++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(num);
                }
            }
        System.out.println("");
        }
    }

    public static void sillyNumbers2() {
        for (int a = 0; a < 4; a++) {
            for (int num = 9; num != 0; num--) {
                for (int i = 0; i < num; i++) {
                    System.out.print(num);
                }
            }
        System.out.println("");
        }
    }

    public static void dollarsAndStars() {
        for (int line = 0; line < 7; line++) {
            for (int star1 = 0; star1 < line*2; star1++) {
                System.out.print("*");
            }
            for (int dollar1 = 7; dollar1 > line; dollar1--) {
                System.out.print("$");
            }
            for (int star2 = 14; star2 > line*2; star2--) {
                System.out.print("*");
            }
            for (int dollar2 = 7; dollar2 > line; dollar2--) {
                System.out.print("$");
            }
            for (int star3 = 0; star3 < line*2; star3++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        System.out.println("addEvens");
        System.out.println(addEvens(7));
        System.out.println(addEvens(6));
        System.out.println(addEvens(4));
        System.out.println("");

        System.out.println("printSquaresBack");
        printSquaresBack(8);
        printSquaresBack(9);
        printSquaresBack(10);
        System.out.println("");

        System.out.println("reverse");
        System.out.println(reverse("Pikachu"));
        System.out.println(reverse("Color"));
        System.out.println(reverse("Birthday"));
        System.out.println("");

        System.out.println("stutter");
        System.out.println(stutter("Hello"));
        System.out.println(stutter("Bye"));
        System.out.println(stutter("abc"));
        System.out.println("");

        System.out.println("sillyNumbers");
        sillyNumbers();
        System.out.println("");

        System.out.println("sillyNumbers2");
        sillyNumbers2();
        System.out.println("");

        System.out.println("dollarsAndStars");
        dollarsAndStars();
    }
}

// addEvens
// 12
// 12
// 6

// printSquaresBack
// 64, 49, 36, 25, 16, 9, 4, 1
// 81, 64, 49, 36, 25, 16, 9, 4, 1
// 100, 81, 64, 49, 36, 25, 16, 9, 4, 1

// reverse
// uhcakiP
// roloC
// yadhtriB

// stutter
// HHeelllloo
// BByyee
// aabbcc

// sillyNumbers
// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999

// sillyNumbers2
// 999999999888888887777777666666555554444333221
// 999999999888888887777777666666555554444333221
// 999999999888888887777777666666555554444333221
// 999999999888888887777777666666555554444333221

// dollarsAndStars
// $$$$$$$**************$$$$$$$
// **$$$$$$************$$$$$$**
// ****$$$$$**********$$$$$****
// ******$$$$********$$$$******
// ********$$$******$$$********
// **********$$****$$**********
// ************$**$************
