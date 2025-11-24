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

    // public static void sillyNumbers() {
    //     for (int num = 1; num < 10; num++) {
    //         System.out.print();
    //     }
    // }

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

    }
}
