/** Exercise 3: java.util.Random
        A / Using the java.util.Random.nextDouble method ()
            generate 10 random real numbers.

        B / How to modify the program to produce 10
            random numbers in space (20.0, 30.0); */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        /* 1. PRODUCE 10 RANDOM DOUBLE NUMBERS */
        System.out.println("10 RANDOM DOUBLES");
        for (int i = 0; i < 10; i++)
            System.out.print(rand.nextDouble() + " ");
        System.out.println();
        System.out.println();

        /* 2. PRODUCE 10 RANDOM NUMBERS BETWEEN 20.0 TO 30.0 */
        System.out.println("10 RANDOM DOUBLES FROM 20.0 TO 30.0");
        for (int i = 0; i < 10; i++)
            System.out.print(20.0 + rand.nextDouble(11.0) + " ");
        System.out.println();

    }
}
