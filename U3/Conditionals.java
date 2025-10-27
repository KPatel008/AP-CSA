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
    }
}
