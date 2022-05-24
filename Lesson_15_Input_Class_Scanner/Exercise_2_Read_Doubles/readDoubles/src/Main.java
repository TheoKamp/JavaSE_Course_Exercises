/** Exercise 2:
 *  Build a program that reads real numbers and print their average. */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double sum = 0.0; // Summary of entered numbers
        int numbersEntered = 0; // Store the number of inputs to div with sum
        while (true) {
            System.out.print("Enter a double or (q) to exit: ");
            if (sc.hasNextDouble()) {
                sum += sc.nextDouble();
                numbersEntered++;
            }
            else {
                if (sc.next().equals("q"))
                    break;
                System.out.println("Only doubles please");
            }
        }
        System.out.println("Average: " + (sum/numbersEntered));
        sc.close();
    }
}
