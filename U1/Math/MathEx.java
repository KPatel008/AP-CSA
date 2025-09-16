package U1.Math;

public class MathEx {
    public static void main(String[] args) {
        int input = 123;
		int output = swap(input);
		System.out.println(input +" " + output);
		
		input = 6328;
		output = swap(input);
		System.out.println(input +" " + output);
		
		input = 1058;
		output = swap(input);
		System.out.println(input +" " + output);

        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);

        System.out.println(dayOfWeek(0,1));
		System.out.println(dayOfWeek(0,14));
		System.out.println(dayOfWeek(6, 22));
		System.out.println(dayOfWeek(5, 4));
		System.out.println(dayOfWeek(1,24));
		System.out.println(dayOfWeek(2,1));
    }

    /*
     * Swaps the tens and ones digits of a number. If the number has more than two digits, the other digits remain unchanged.
     * @param - int num - number that needs to be swapped
     * @return - int - number with the tens and ones digits swapped
     */
    public static int swap(int num) {
        int tens = num%100/10;
        int ones = (num%10)*10;
        int others = (num/100)*100;


        return others + ones + tens;
    }

    /*
     * Calculates the time left between two times given in hours and minutes.
     * @param - int curHour - current hour
     * @param - int curMin - current minute
     * @param - int depHour - departure hour
     * @param - int depMin - departure minute
     * @return - void
     */
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        int a = depHour*60 + depMin - curHour*60 - curMin;
        int diffHours = a/60;
        int diffMinutes = a%60;
        System.out.println(diffHours + " hours and " + diffMinutes + " minutes.");
    }
    
    /*
     * Calculates the day of the week for a given date in January, given the day of the week for January 1st
     * @param - int jan1day - day of the week for January 1st (0 through 6: 0 corresponding to Sunday, 6 corresponding to Saturday)
     * @param - int date - date in January
     * @return - int - day of the week for the given date (as used in the jan1day parameter)
     */
    public static int dayOfWeek(int jan1day, int date) {
        int newdate = date + jan1day - 1;
        newdate = newdate%7;
        return newdate;
    }

    // 123 132
    // 6328 6382
    // 1058 1085
    // 3 hours and 21 minutes.
    // 6 hours and 46 minutes.
    // 0
    // 6
    // 6
    // 1
    // 3
    // 2
}
