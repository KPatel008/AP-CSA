package U2.Scanner;

import java.util.Scanner;

public class Strings {

    /*
     * takes a word as a string and moves first letter to the end of the word
     * @param - String s - the input word
     * @return - String - The word with the first letter moved to the end
     */
    public static String scroll(String s) {
        int len = s.length();
        String first = s.substring(0, 1);
        String end = s.substring(1,len);
        return end + first;
    }

    public static String convertName(String name) {
        int commaloc = name.indexOf(",");
        String last = name.substring(0, commaloc);
        String trimlast = last.trim();
        String first = name.substring(commaloc + 1);
        String trimfirst = first.trim();
        return trimfirst + " " + trimlast;
    }

    public static String removeSSN(String SSN) {
        String newSSN = SSN.replace("-", "");
        return newSSN;
    }

    public static String dateString(String dateStr) {
        int len = dateStr.length();
        int slash1 = dateStr.indexOf("/");
        int slash2 = dateStr.indexOf("/", slash1 + 1);
        String day = dateStr.substring(slash1 + 1, slash2);
        String month = dateStr.substring(0,slash1);
        String year = dateStr.substring(slash2 + 1, len);
        return day + "-" + month + "-" + year;
    }

    public static String negative(String number) {
        String part1 = number.replace("1", "a");
        String part2 = part1.replace("0", "1");
        String part3 = part2.replace("a", "0");
        return part3;
    }

    public static void nameGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        sc.close();

        int space = name.indexOf(" ");

        String firstname = name.substring(0, space);
        int firstlen = firstname.length();
        String firstlettergone = name.substring(1,firstlen);
        System.out.println(firstname + ", " + firstname + ", bo-B" + firstlettergone);

    }

    public static void main(String[] args) {

    System.out.println(scroll("Hello World"));
    System.out.println(scroll("happy"));
    System.out.println(scroll("h"));

    System.out.println(convertName(" Reubenstein, Lori Renee  	"));
    System.out.println(convertName("Swift,Taylor"));
    System.out.println(convertName("the Clown, Bozo"));


    System.out.println("123-45-6789 is " + removeSSN("123-45-6789"));

    System.out.println(negative("0010111001"));
    System.out.println(negative("11111111"));

    System.out.println("04/20/2025 becomes " + dateString("04/20/2025"));
    System.out.println("4/2/2025 becomes " + dateString("4/2/2025"));
    // nameGame();
    }
}
