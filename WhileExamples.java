public class WhileExamples {
    public static void fibbonacci(int max) {
        int first = 0;
        int second = 1;
        int counter = first;

        System.out.println(first + " ");
        System.out.println(second + " ");
        while (counter < max) {
            counter = first + second;
            System.out.println(counter + " ");
            first = second;
            second = counter;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        while (x < 10000) {
            fibbonacci(x);
            x=x*10;
        }
    }
}