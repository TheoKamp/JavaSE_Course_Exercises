import java.util.Arrays;
import java.util.Random;

/** Exercise 4: java.util.Arrays
        1. Construct a table with 10 random integers in interval [0.5] (using Random.nextInt ())
        2. Then sort it using Arrays.sort (arrayName) of the java.util.Arrays class
        3. Then look for the position in the table of item "3", using binarySearch of the java.util.Arrays class
        [Note: binarySearch accepts the name as the first argument of the classified table and as a
         second argument the sub search item. Returns the position of the item in table] */

public class Main {

    public static void main(String[] args) {
        int[] randNumbers = new int[10]; // STORES THE 10 RANDOM NUMBERS
        Random random = new Random();

        /* INITIALIZE randNumbers ARRAY WITH 10 INTEGERS FROM 0 TO 5 */
        for (int i = 0; i < randNumbers.length; i++)
            randNumbers[i] = random.nextInt(6);

        /* PRINT THE ORIGINAL ARRAY */
        System.out.println("ORIGINAL ARRAY");
        System.out.println(Arrays.toString(randNumbers));

        /* SORT AND PRINT THE ARRAY */
        Arrays.sort(randNumbers);
        System.out.println("SORTED ARRAY");
        System.out.println(Arrays.toString(randNumbers));

        /* SEARCH FOR ELEMENT WITH binarySearch METHOD */
        int pos = Arrays.binarySearch(randNumbers, 3);
        if (pos < 0)
            System.out.println("Element don't exist in the array");
        else
            System.out.println("Element: " + randNumbers[pos] + " found in position: " + pos);
    }
}
