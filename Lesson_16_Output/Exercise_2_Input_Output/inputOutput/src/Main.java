/** Exercise 2:
     Write a complete program that will accept and will
     print different user inputs.
         Specifically the main will prompt the user to enter one
         number from 1 to 4 (to check that the user entered number from 1 to 4)
         • If the user enters 1, read an integer variable and to print the square.
         • If the user enters 2, call a static method of the same class (name the print) in which to read one
           integer number N and print N times the word 'Good Morning!'.
         • If the user enters 3, read a float variable, and prints its ((that is, divides it by 4 and prints
           the result) to 4 decimal places.
         • If the user enters 4, switch to a static method (name arrayManip) which indicates a 5 double array
           variables, reads their values from the keyboard and prints their average. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static int readInt(Scanner src, int from, int to) {
        int tempInt;
        while (true) {
            System.out.print("Enter a number: ");
            if (src.hasNextInt()) {
                tempInt = src.nextInt();
                if (tempInt >= from && tempInt <= to)
                    return tempInt;
                else {
                    System.out.printf("Only from %d to %d\n", from, to);
                    src.nextLine();
                }
            }
            else {
                System.out.println("Only numbers please!");
                src.nextLine();
            }
        }
    }

    public static int readInt(Scanner src) {
        src.nextLine();
        while (true) {
            System.out.print("Enter a number: ");
            if (src.hasNextInt())
                return src.nextInt();
            else {
                System.out.println("Only numbers please!");
                src.nextLine();
            }
        }
    }

    public static void printMessage(Scanner src) {
        int N = readInt(src);
        for (int i = 0; i < N; i++)
            System.out.println("Good Morning!");
        System.out.println();
    }

    public static double readDouble(Scanner src) {
        src.useLocale(Locale.US);
        src.nextLine();
        while (true) {
            System.out.print("Enter a number: ");
            if (src.hasNextDouble())
                return src.nextDouble();
            else {
                System.out.println("Only doubles please!");
                src.nextLine();
            }
        }
    }

    public static void arrayManip(Scanner src) {
        double[] doubles = new double[5];
        double sum = 0.0;
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = readDouble(src);
            sum += doubles[i];
        }
        System.out.printf(Locale.US,"The average is: %.2f\n", sum/doubles.length);
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            out:while (true) {
                System.out.println("MAKE A CHOICE FROM 1 TO 4 OR (5) TO QUIT");
                int choice = readInt(input, 1, 5);
                switch (choice) {
                    case 1->{
                        System.out.println("\n*ENTER A NUMBER AND SEE THE SQUARE OF IT*");
                        int number = readInt(input);
                        int square = (int)Math.pow(number, 2);
                        System.out.printf("The square of %d is: %d\n\n", number, square);
                    }
                    case 2->{
                        System.out.println("\n*PRINT A MESSAGE*");
                        printMessage(input);
                    }
                    case 3->{
                        System.out.println("\n*ENTER A NUMBER AND SEE THE ONE QUARTER OF IT*");
                        double dNum = readDouble(input);
                        System.out.printf(Locale.US,"The one quarter of %.4f is %.4f\n", dNum, dNum/4);
                    }
                    case 4->{
                        System.out.println("\n*ENTER 5 NUMBERS AND SEE THEIR AVERAGE*");
                        arrayManip(input);
                    }
                    case 5-> {
                        System.out.println("Goodbye!");
                        break out;
                    }
                }
            }

        }
    }
}
