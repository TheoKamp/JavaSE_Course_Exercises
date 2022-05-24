/*
    Exercise 5:
        The point class (of the level):
            • It has as members the coordinates of x, y
            • Has a constructor that sets the coordinates of the point at (0.0).
            • It has a method called set and accepts two parameters, the x, y
              and sets the values of its members equal to the corresponding ones parameters.
            • Has the print method that prints the dot in format, e.g. (3.5).
        Then to main:
            • Define a point.
            • Print it.
            • Randomly set its coordinates to 0 up to 10 using the set function
            • Print it.
            • Randomly set its coordinates to 10 up to 20 using direct access to members x, y
            • Print it.
*/
import java.util.Random;

class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Point point = new Point(); // Define a point

        point.setPoint(rand.nextInt(11), rand.nextInt(11));

        point.x = 10+rand.nextInt(10);
        point.y = 10+rand.nextInt(10);

    }
}
