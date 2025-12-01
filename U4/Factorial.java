public class Factorial {
    public static int calcFactorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
    }
}
