package U2.Scanner;

import java.util.Scanner;

public class ScanString
{
   public static void main(String[] args) {
        // create a scanner to read input from user.
        Scanner sc = new Scanner(System.in); 
        System.out.println("Type a word.");
        String word1 = sc.nextLine();
        System.out.println("Type a word.");
        String word2 = sc.nextLine();
        System.out.println(word1 + " " + word2);
        sc.close(); // close scanner

        // play with the words
        int len1 = word1.length();
        int len2 = word2.length();
        // first halves
        String f1 = word1.substring(0, len1/2);
        String f2 = word2.substring(0, len2/2);
        String end1 = word1.substring(len1/2);
        String end2 = word2.substring(len2/2);
        System.out.println(f1 + " " + f2 + " " + end1 + " " + end2);
        String new1 = f1+end2;
        String new2 = f2+end1;
        System.out.println(new1 + " " + new2);

        // find and replace stuff
        int loc1 = word1.indexOf("oo");
        int loc2 = word1.indexOf("aa");
        System.out.println(loc1 + " " + loc2);
        String new3 = word1.replace("oo", "aa");
        System.out.println(new3);
        String new4 = new3.replace("k","x");
        System.out.println(new4);
        System.out.println(new4.toUpperCase());
   } 
}
