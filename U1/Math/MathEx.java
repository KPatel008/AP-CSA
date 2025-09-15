package U1.Math;

public class MathEx {

    public static void main(String[] args) {
        System.out.println(swap(123));
        System.out.println(swap(7789));
        System.out.println(swap(643));

        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
    }

    public static int swap(int num) {
        int tens = num%100/10;
        int ones = num%10;
        int others = num/100;


        return others*100 + ones*10 + tens;
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int a = depHour*60 + depMin - curHour*60 - curMin;
        int diffHours = a/60;
        int diffMinutes = a%60;
        System.out.println(diffHours + " hours and " + diffMinutes + " minutes.");
    }
}
