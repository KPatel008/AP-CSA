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

    /**
     * takes a name in the format "last, first" and converts it to "first last"
     * @param - String name- the name in "last, first" format
     * @return - String - the name in "first last" format
     */
    public static String convertName(String name) {
        int commaloc = name.indexOf(",");
        String last = name.substring(0, commaloc);
        String trimlast = last.trim();
        String first = name.substring(commaloc + 1);
        String trimfirst = first.trim();
        return trimfirst + " " + trimlast;
    }

    /**
     * removes the dashes from a social security number
     * @param - String SSN - the social security number in the format "123-45-6789"
     * @return - String - the social security number in the format "123456789"
     */
    public static String removeSSN(String SSN) {
        String newSSN = SSN.replace("-", "");
        return newSSN;
    }

    /**
     * converts a date from MM/DD/YYYY format to DD-MM-YYYY format
     * @param - String dateStr - the date in MM/DD/YYYY format
     * @return - String - the date in DD-MM-YYYY format
     */
    public static String dateString(String dateStr) {
        int len = dateStr.length();
        int slash1 = dateStr.indexOf("/");
        int slash2 = dateStr.indexOf("/", slash1 + 1);
        String day = dateStr.substring(slash1 + 1, slash2);
        String month = dateStr.substring(0,slash1);
        String year = dateStr.substring(slash2 + 1, len);
        return day + "-" + month + "-" + year;
    }

    /**
     * takes a binary number as a string and returns the negative of that number
     * @param - String number - the binary number as a string
     * @return - String - the negative of the binary number as a string
     */
    public static String negative(String number) {
        String part1 = number.replace("1", "a");
        String part2 = part1.replace("0", "1");
        String part3 = part2.replace("a", "0");
        return part3;
    }

    /**
     * makes rhyme with given name
     * @return - void
     */
    public static void nameGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        sc.close();

        int space = name.indexOf(" ");

        String firstName = name.substring(0, space);
        int firstlen = firstName.length();
        String firstLetterGone = firstName.substring(1,firstlen);
        System.out.println(firstName + ", " + firstName + ", bo-B" + firstLetterGone);
        System.out.println("Banana-fana fo-F" + firstLetterGone);
        System.out.println("Fee-fi-mo-M" + firstLetterGone);
        System.out.println(firstName.toUpperCase() + "!");

        String lastName = name.substring(space + 1,name.length());
        String lastLetterGone = lastName.substring(1, lastName.length());
        System.out.println(lastName + ", " + lastName + ", bo-B" + lastLetterGone);
        System.out.println("Banana-fana fo-F" + lastLetterGone);
        System.out.println("Fee-fi-mo-M" + lastLetterGone);
        System.out.println(lastName.toUpperCase() + "!");
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
    nameGame();
    }
}

// ello WorldH
// appyh
// h
// Lori Renee Reubenstein
// Taylor Swift
// Bozo the Clown
// 123-45-6789 is 123456789
// 1101000110
// 00000000
// 04/20/2025 becomes 20-04-2025
// 4/2/2025 becomes 2-4-2025
// What is your name?
// Krish Patel
// Krish, Krish, bo-Brish
// Banana-fana fo-Frish
// Fee-fi-mo-Mrish
// KRISH!
// Patel, Patel, bo-Batel
// Banana-fana fo-Fatel
// Fee-fi-mo-Matel
// PATEL!
