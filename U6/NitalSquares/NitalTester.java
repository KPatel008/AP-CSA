package U6.NitalSquares;
import java.util.Arrays;
public class NitalTester {

    /** Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 are the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int [] arr1, int[] arr2){
        int c = 0;
        for (int r = 0; r < arr1.length; r++) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[r] == arr2[i]) {c++; break;}
            }
        }
        if (c == arr1.length) {return true;}
        return false;
    }

    /** Returns true if arr contains any repeated values, false otherwise.
     */
    public static boolean containsRepeats(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {return true;}
            }
        }
        return false;
    }

    /* Write a static method getColumn, which returns a one-dimensional
    array containing the elements of a single column in a two-dimensional
    array.  The elements in the returned array should be in the same order
    as they appear in the given column.  The notation arr2D[r][c] represents
    the array element at row r and column c
    The following code segment initializes an array and calls getColumn().

    int[][] arr2D = { { 0, 1, 2},
                      { 3, 4, 5},
                      { 9, 5, 3}};
    int[] result = NitalTester.getColumn(arr2D, 1);

    When the code segment has completed execution, the variable result
    will have the following contents:

                result: {1, 4, 5}
     */

    /** Returns an array containing the elements of column c of
     * arr2D in the same order they appear in arr2D
     * Precondition: c is a valid column in arr2D  (columns start with 0)
     * Postcondition: arr2D is unchanged.
     */
    public static int [] getColumn(int[][] arr2D, int c){
		int[] c1 = new int[arr2D[0].length];
        for (int r = 0; r < arr2D.length; r++) {
            c1[r] = arr2D[r][c];
        }
		return c1;
    }

    /* Write the method isNital below.  You must use getColumn,
    hasAllValues and containsRepeats appropriately to receive
    full credit.
     */
    /** Returns true if square is a Nital Square as described in the
     * word doc, false otherwise.
     * Precondition: square has an equal number of rows and columns.
     *      square has at least one row.
     */
    public static boolean isNital(int[][] square){
        int[] firstRow = square[0];
        for (int i = 0; i < square.length; i++) {
            int[] rows = square[i];
            if (!hasAllValues(rows, firstRow)) {return false;}
            for (int j = 0; j < square[0].length; j++) {
                int[] columns = getColumn(square, j);
                if (!hasAllValues(firstRow, columns)) {return false;}
            }
        } 
        boolean repeat = containsRepeats(firstRow);
        if (repeat) {return false;}
		return true;
    }

        public static void main(String[] args){
        int[] a1 = {2,4,6,8};
        int[] a2 = {2,4,6,2};
        int [] a3 = {8,6,4,2};
        System.out.println("Has all values");
        System.out.println(hasAllValues(a1, a3));
        System.out.println(hasAllValues(a1, a2));
        System.out.println("Contains Repeats");
        System.out.println(containsRepeats(a1));
        System.out.println(containsRepeats(a2));
        
        int[][] n1 = {{1,2,3},{2,3,1},{3,1,2}};
        int[][] n2 = {{10,30,20,0},{0,20,30,10},{30,0,10,20},{20,10,0,30}};
        int[][] n3 = {{1,2,1},{2,1,1},{1,1,2}};
        int[][] n4 = {{1,2,3},{3,1,2},{7,8,9}};
        int[][] n5 = {{1,2},{1,2}};
        int[][] n6 = {{1,1},{2,2}};
        int[][] n7 = {{1,2,3}, {2,3,1}, {3,1,5}};

        System.out.println("Get Column");
        System.out.println(Arrays.toString(getColumn(n1, 2)));
        System.out.println(Arrays.toString(getColumn(n4, 0)));
        System.out.println("is Nital");
        System.out.println(isNital(n1));
        System.out.println(isNital(n2));
        System.out.println(isNital(n3));
        System.out.println(isNital(n4));
        System.out.println(isNital(n5));
        System.out.println(isNital(n6));
        System.out.println(isNital(n7));
		
    }
}

// Has all values
// true
// false
// Contains Repeats
// false
// true
// Get Column
// [3, 1, 2]
// [1, 3, 7]
// is Nital
// true
// true
// false
// false
// false
// false
// false