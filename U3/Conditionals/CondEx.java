package U3.Conditionals;

public class CondEx {
    /*  
     * determines if a year is a leap year
     * @param - int year - the year to check
     * @return - boolean - true if the year is a leap year, false if it   
     */
    public boolean isLeapYear(int year) {
        if (year%4 == 0 && (year%100 != 0 || year%400 == 0))
            return true;
        return false; 
    }

    /* determines if one date is sooner than another
     * @param - int month1, int day1, int year1 - the first date
     * @param - int month2, int day2, int year2 - the second date
     * @return - boolean - true if the first date is sooner than the second date
     */
    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2) {
        if (year1 < year2)
            return true;
        if (year1 == year2) {
            if (month1 < month2) {return true;}
            if (month1 == month2) {
                if (day1 < day2) {return true;}
                return false;
            }
        }
        return false;
    }

    /*
     * determines which size(s) of item(s) will best fit in a given space
     * @param - int space - the available space
     * @param - int size1 - the size of the first item
     * @param - int size2 - the size of the second item
     * @return - int - 0 if neither item fits, 1 if only the first item fits, 2 if only the second item fits, 3 if both items fit
     */
    public int findBestFit(int space, int size1, int size2) {
        if (size1 + size2 <= space) {return 3;}
        if (size1 <= space && size2 <= space){
            if (size1 >= size2) {return 1;}
            return 2;}
        if (size2 == space) {return 2;}
        if (size1 > space && size2 > space) {return 0;}
        if (size1 > size2) {return 2;}
        return 1;
    }

    /*
     * determines if it is possible to make a certain length bench using small and big planks
     * @param - int small - the number of small planks (1 foot each)
     * @param - int big - the number of big planks (5 feet each)
     * @param - int goal - the desired length of the bench
     * @return - boolean - true if it is possible to make the bench, false otherwise
     */
    public boolean makeBenches(int small, int big, int goal) {
        if (goal > small + big*5) return false;
        int totalBig = goal/5;
        if (totalBig < big) big = totalBig;
        if (big*5 + small >= goal) return true;
        return false;

    }

    /*
     * removes HTML tags from a string
     * @param - String s - the string with HTML tags
     * @param - String tag - the HTML tag to remove
     * @return - String - the string with the specified HTML tags removed, or the original string if the tags are not correct or are out of order
     */
    public String removeTag(String s, String tag){
        int tag1Correct = s.indexOf(tag);
        int tag2Correct = s.indexOf("/" + tag);
        if (tag1Correct > tag2Correct) return s;
        if (tag1Correct == -1 || tag2Correct == -1) return s;
        return s.substring(tag1Correct + tag.length() + 1, tag2Correct - 1);
    }

    public static void main(String[] args) {
        CondEx ce = new CondEx();

    // leap year
    System.out.println("2000 " + ce.isLeapYear(2000));
    System.out.println("2004 " + ce.isLeapYear(2004));
    System.out.println("2003 " + ce.isLeapYear(2003));
    System.out.println("2100 " + ce.isLeapYear(2100));

    // is sooner
    System.out.println("isSooner");
    System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
    System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
    System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
    System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
    System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
    System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
    System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
    System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
    System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));


    // Best Fit
    System.out.println("Best Fit");
    System.out.println("Find Best fit 6 2 3 is " + ce.findBestFit(6,2,3));
    System.out.println("Find Best fit 6 4 3 is " + ce.findBestFit(6,4,3));
    System.out.println("Find Best fit 6 3 4 is " + ce.findBestFit(6,3,4));
    System.out.println("Find Best fit 1 2 3 is " + ce.findBestFit(1,2,3));
    System.out.println("Find Best fit 4 6 3 is " + ce.findBestFit(4,6,3));
    System.out.println("Find Best fit 4 3 6 is " + ce.findBestFit(4,3,6));
    System.out.println("Find Best fit 4 3 3 is " + ce.findBestFit(4,3,3));
    System.out.println("Find Best fit 4 4 3 is " + ce.findBestFit(4,4,3));


    // Make Bench
    System.out.println("Make benches 3 1 8 is " + ce.makeBenches(3,1,8));
    System.out.println("Make benches 3 1 9 is " + ce.makeBenches(3,1,9));
    System.out.println("Make benches 11 1 15 is " + ce.makeBenches(11,1,15));
    System.out.println("Make benches 4 2 15 is " + ce.makeBenches(4,2,15));
    System.out.println("Make benches 20 0 20 is " + ce.makeBenches(20,0,20));
    System.out.println("Make benches 3 4 20 is " + ce.makeBenches(3,4,20));
    System.out.println("Make benches 0 6 30 is " + ce.makeBenches(0,6,30));
    System.out.println("Make benches 0 5 30 is " + ce.makeBenches(0,5,30));
    System.out.println("Make benches 2 6 23 is " + ce.makeBenches(2,6,23));
    System.out.println("Make benches 3 2 23 is " + ce.makeBenches(3,2,23));

    System.out.println("\nremoveTag");
    System.out.println(ce.removeTag("<b>Hello World</b>", "b"));
    System.out.println(ce.removeTag("<b>Hello World</b>", "head"));
    System.out.println(ce.removeTag("Hello World</b>", "b"));
    System.out.println(ce.removeTag("<b>Hello World", "b"));
    System.out.println(ce.removeTag("</img>Hello World<img>", "img"));
    System.out.println(ce.removeTag("Happy Birthday <b>Hello World</b>", "b"));
    System.out.println(ce.removeTag("<title>Hello World</title> Happy Birthday","title"));
    System.out.println(ce.removeTag("Happy <b>Hello World</b> Birthday", "b"));

    }
}

// 2000 true
// 2004 true
// 2003 false
// 2100 false
// isSooner
// 1/2/2010 is sooner than 1/2/2011 true
// 2/1/2011 is sooner than 2/2/2010 false
// 1/2/2011 is sooner than 2/2/2010 false
// 1/5/2010 is sooner than 3/2/2010 true
// 3/2/2010 is sooner than 1/2/2010 false
// 1/3/2010 is sooner than 1/2/2010 false
// 5/2/2010 is sooner than 1/3/2011 true
// 1/2/2010 is sooner than 1/2/2010 false
// 4/8/2010 is sooner than 1/2/2010 false
// Best Fit
// Find Best fit 6 2 3 is 3
// Find Best fit 6 4 3 is 1
// Find Best fit 6 3 4 is 2
// Find Best fit 1 2 3 is 0
// Find Best fit 4 6 3 is 2
// Find Best fit 4 3 6 is 1
// Find Best fit 4 3 3 is 1
// Find Best fit 4 4 3 is 1
// Make benches 3 1 8 is true
// Make benches 3 1 9 is false
// Make benches 11 1 15 is true
// Make benches 4 2 15 is false
// Make benches 20 0 20 is true
// Make benches 3 4 20 is true
// Make benches 0 6 30 is true
// Make benches 0 5 30 is false
// Make benches 2 6 23 is false
// Make benches 3 2 23 is false

// removeTag
// Hello World
// <b>Hello World</b>
// Hello World</b>
// <b>Hello World
// </img>Hello World<img>
// Hello World
// Hello World
// Hello World

