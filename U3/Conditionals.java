package U3;

public class Conditionals {
    public static boolean freshmanTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = false;
        if (aSmile != bSmile)
            trouble = false;
        else 
            trouble = true;
        return trouble;
    }

    public static boolean negPos(int num1, int num2, boolean a) {
        if ((num1 < 0 && num2 < 0) && a) {
            return true;
        }
        if ((num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0) && !a){
            return true;
        }
        else
            return false;
    }

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

    public static boolean onesDigitSame(int a, int b, int c) {
         a = a%10;
         b = b%10;
         c = c%10;
        if (a==c||a==b||b==c) {
            return true; }
        else
            return false;
    }

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


        String p2a = popBang("party");
        String p2b = popBang("glob");
        String p2c = popBang("plumb"); 
        String p2d = popBang("hello"); 
        System.out.println(p2a + " " + p2b + " " + p2c + " " + p2d);
    }
}
