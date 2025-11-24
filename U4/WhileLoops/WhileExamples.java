package WhileLoops;
public class WhileExamples {
    public static int sumUpToWhile(int n)
    {
        int sum = 0;
        int i = 1;	//initialize
        while (i <= n)	//test
        {
            sum += i;
            i++;	//increment
        }
        return sum;
    }

    public static void fibbonacci(int max){
        int first = 0;
        int second = 1;
        int counter = first;

        System.out.print(first + " ");
        System.out.print(second + " ");
        while (counter < max){
            counter = first + second;
            System.out.print(counter + " ");
            first = second;
            second = counter;
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 4;
        while (a <= 7){
            int b = sumUpToWhile(a);
            System.out.println(a +" sums " + b);
            a++;
        }

        int x = 10;
        while(x < 10000){
            fibbonacci(x);
            x = x*10;
        }
    }
}
