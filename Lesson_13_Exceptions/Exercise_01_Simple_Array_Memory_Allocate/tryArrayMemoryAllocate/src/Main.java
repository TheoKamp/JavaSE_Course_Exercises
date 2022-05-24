/** Exercise 1:
        Construct an array of integers, whatever
        so large that memory allocate is impossible.
        Notice the object of the exception and then write
        code that will handle the exception and not cause it
        stop the program, but will inform the user that
        memory allocate failed. */
import java.util.*;
public class Main {

    public static void main(String[] args) {
//       try {
//           int[] array = new int[1000000000];
//       }
//       catch (OutOfMemoryError exception) {
//           System.out.println("ERROR: Memory Allocate Fail");
//       }
        System.out.println((int)-Math.pow(2, 31));
        long l = -100000000000000L;
    }
}
