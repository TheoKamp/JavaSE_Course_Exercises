/** Exercise 2:
        Study the object - exception that arises if
        try to access a location outside the boundaries
        table that we use in our program.
        Then write the appropriate code to handle the exception
        and displaying a message to the user. */

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            array[6] = 1;
        }
        catch (IndexOutOfBoundsException exception) {
            System.err.println("ERROR: " + exception.getMessage());
        }


    }
}
