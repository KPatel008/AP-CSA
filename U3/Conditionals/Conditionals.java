package U3.Conditionals;

public class Conditionals {

    /*
     * determines if there is trouble based on their attitudes
     * @param - boolean aSmile - is A smiling
     * @param - boolean bSmile - is B smiling
     * @return - boolean - true if there is trouble, false if there is not
     */
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = false;
        if (aSmile != bSmile)
            trouble = false;
        else 
            trouble = true;
        return trouble;
    }

    /*
     * determines if one number is negative and one number is positive and will return true, unless negative is true, then it will return true if both numbers are negative
     * @param - int num1 - the first number
     * @param - int num2 - the second number
     * @param - boolean negative - indicates if both numbers should be negative
     * @return - boolean - true if one number is negative and one is positive, or if both are negative based on the flag
     */
    public static boolean negPos(int num1, int num2, boolean negative) {
        if ((num1 < 0 && num2 < 0) && negative) {
            return true;
        }
        if ((num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) && !negative){
            return true;
        }
        else
            return false;
    }

    /*
     * determines if you should pick up the phone based on the time of day, who is calling, and if you are asleep
     * @param - boolean isMorning - indicates if it is morning
     * @param - boolean isMom - indicates if it is your mom calling
     * @param - boolean isAsleep - indicates if you are asleep
     * @return - boolean - true if you should pick up the phone, false if you should not
     */
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            if (isMom) {
                return true;
            }
            else {return false;}
        }
        else {return true;}
    }

    /*
     * determines what time to set the alarm based on the day of the week and if you are on vacation
     * @param - int day - the day of the week
     * @param - boolean vac - indicates if you are on vacation
     * @return - String - the time to set the alarm ("7:00", "10:00", or "off")
     */
    public static String setAlarm(int day, boolean vac) {
        if (vac) {
            if (day >= 1 && day <= 5) {
                return "10:00";
            }
            else {
                return "off";
            }
        }
        else {
            if (day >= 1 && day <= 5) {
                return "7:00";
            }
            else {
                return "10:00";
            }
        }
    }

    /*
     * determines if two or more numbers have the same ones digit
     * @param - int a - the first number
     * @param - int b - the second number
     * @param - int c - the third number
     * @return - boolean - true if two or more numbers have the same ones digit, false if none do
     */
    public static boolean onesDigitSame(int a, int b, int c) {
         a = a%10;
         b = b%10;
         c = c%10;
        if (a==c||a==b||b==c) {
            return true; }
        else
            return false;
    }

    /*
     * determines which number is closest to 21 without going over
     * @param - int a - the first number
     * @param - int b - the second number
     * @return - int - the number closest to 21 without going over, or 0 if both numbers go over
     */
    public static int blackjack(int a, int b) {
        if (a>21&&b>21) {
            return 0;
        }
        if (b>21) {
            return a;
        }
        if (a>21){
            return b;
        }
        if (a>b) {
            return a;
        }  
        else
            return b;
        }

        /*
         * determines if a string starts with 'p' and ends with 'b' and returns a specific string based on that
         * @param - String str - the input string
         * @return - String - "Pop" if 'p', "Bang" if 'b', "PopBang" if both, or regular string if neither
         */
    public static String popBang(String str) {
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        if (first.equals("p")&&last.equals("b")) {
            return "PopBang";
        }
        if (first.equals("p")) {
            return "Pop";
        }
        if (last.equals("b")) {
            return "Bang";
        }
        else
            return str;
    }

    public static void main(String[] args) {
        System.out.println("freshmanTrouble");
        boolean fa = freshmanTrouble(true, true);
        boolean fb = freshmanTrouble(false, false);
        boolean fc = freshmanTrouble(true, false);
        boolean fd = freshmanTrouble(false, true);
        System.out.println(fa + " " + fb + " " + fc + " " + fd);

        System.out.println("");
        
        System.out.println("negPos");
        boolean na = negPos(1, -1, false);
        boolean nb = negPos(-1, 1, false);
        boolean nc = negPos(1, 1, false);
        boolean nd = negPos(-1, -1, false);
        boolean ne = negPos(-4, -5, true);
        boolean nf = negPos(-4, 5, true);
        boolean ng = negPos(4, 5, true);
        boolean nh = negPos(4, -5, true);
        System.out.println(na + " " + nb + " " + nc + " " + nd + " " + ne + " " + nf + " " + ng + " " + nh);

        System.out.println("");

        System.out.println("pickUpPhone");
        boolean pa = pickUpPhone(false, false, true);
        boolean pb = pickUpPhone(true, true, true);
        boolean pc = pickUpPhone(true, true, false);
        boolean pd = pickUpPhone(false, true, false);
        boolean pe = pickUpPhone(true, false, false);
        boolean pf = pickUpPhone(false, false, false);
        System.out.println(pa + " " + pb + " " + pc + " " + pd + " " + pe + " " + pf);

        System.out.println("");

        System.out.println("setAlarm");
        String aa = setAlarm(1, false);
        String ab = setAlarm(5, false);
        String ac = setAlarm (0, false);
        String ad = setAlarm (2, true);
        String ae = setAlarm (4, true);
        String af = setAlarm (6, true);
        System.out.println(aa + " " + ab + " " + ac + " " + ad + " " + ae + " " + af);

        System.out.println("");

        System.out.println("onesDigitSame");
        boolean oa = onesDigitSame(23, 19, 13);
        boolean ob = onesDigitSame (23, 19, 12);
        boolean oc = onesDigitSame (23, 19, 3);
        boolean od = onesDigitSame (423, 13, 3);
        boolean oe = onesDigitSame (23, 29, 25);
        System.out.println(oa + " " + ob + " " + oc + " " + od + " " + oe);

        System.out.println("");

        System.out.println("blackjack");
        int ba = blackjack(19, 21);
        int bb = blackjack(21, 19);
        int bc = blackjack(19, 22);
        int bd = blackjack(8, 8);
        int be = blackjack(25, 24);
        int bf = blackjack(17, 9);
        int bg = blackjack(12,18);
        System.out.println(ba + " " + bb + " " + bc + " " + bd + " " + be + " " + bf + " " + bg);

        System.out.println("");

        System.out.println("popBang");
        String p2a = popBang("party");
        String p2b = popBang("glob");
        String p2c = popBang("plumb"); 
        String p2d = popBang("hello"); 
        System.out.println(p2a + " " + p2b + " " + p2c + " " + p2d);
    }
}

// freshmanTrouble
// true true false false

// negPos
// true true false false true false false false

// pickUpPhone
// false false true true false true

// setAlarm
// 7:00 7:00 10:00 10:00 10:00 off

// onesDigitSame
// true false true true false

// blackjack
// 21 21 19 8 0 17 18

// popBang
// Pop Bang PopBang hello