import java.util.Arrays;

public class DemoArray {
    private int[] numbers;
    public DemoArray(int[] nums){
        numbers = nums;
    }
    public int divBySum(int x){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            int n = numbers[i];
            if(n%x==0) sum += n;
        }
        return sum;
    }
    public int divBySum2(int x){
        int sum = 0;
        for (int n: numbers){
            if(n%x==0) sum += n;
        }
        return sum;
    }
    public int[] divByArr(int x){
        int [] result = new int[10];
        int index = 0;
        for(int n: numbers){
            if(n%x==0 && index < 10){
                result[index] = n;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int [] a1 = {1,4,6,7,9,12,24,28,32,36,40,49};
        DemoArray da = new DemoArray(a1);
        System.out.println(da.divBySum(3));
        System.out.println(da.divBySum2(3));
        System.out.println(Arrays.toString(da.divByArr(3)));
        System.out.println(da.divBySum(5));
        System.out.println(da.divBySum2(5));
        System.out.println(Arrays.toString(da.divByArr(5)));
        System.out.println(da.divBySum(7));
        System.out.println(da.divBySum2(7));
        System.out.println(Arrays.toString(da.divByArr(7)));
    }
}