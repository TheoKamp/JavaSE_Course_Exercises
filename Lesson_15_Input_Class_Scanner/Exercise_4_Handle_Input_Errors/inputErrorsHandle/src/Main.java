/** Exercise 4: Extend example 4, making it appropriate handling all errors that may arise from it.
 *  import java.util.Scanner;
 *
 *  public class Main {
 *      public static void main(String[] args) {
 *          try(Scanner sc = new Scanner(System.in)) {
 *              System.out.print("x=");
 *              int x = sc.nextInt();
 *              System.out.print("y=");
 *              int y = sc.nextInt();
 *              System.out.println("x/y=" + x/y);
 *          }
 *      }
 *  }
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        try(Scanner sc = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("x=");
                    x = sc.nextInt();
                    break;
                }catch (InputMismatchException e) {
                    System.out.println("Only Integers Please!");
                    sc.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.print("y=");
                    y = sc.nextInt();
                    break;
                }catch (InputMismatchException e) {
                    System.out.println("Only Integers Please!");
                    sc.nextLine();
                }
            }
            try {
                System.out.println("x/y=" + x/y);
            }catch (ArithmeticException e) {
                System.out.println(e.toString());
            }

        }
    }
}
