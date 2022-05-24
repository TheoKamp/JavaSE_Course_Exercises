/** Exercise 3:
    Build a program with the following two lines
    code,
        String s = null;
        s.equals("oops");
    and then repeat exercise 1. */

public class Main {

    public static void main(String[] args) {
        String s = null;

        try {
            s.equals("oops");
        }
        catch (NullPointerException exception) {
            System.err.println("ERROR: " + exception.getMessage());
        }

    }
}
