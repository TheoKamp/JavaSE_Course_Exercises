/*
    Exercise 6:
        Extend the "Point" class of the previous exercise with the method:
            • length: Does not accept arguments and returns its length
              of a line segment from (0,0) to its coordinates point.

        In main:
         • Define a point with coordinates (3,4), calculate it
           distance from the beginning of the axes and print the final result.

        Note:
            • For the calculation of the measure we do first in the class code:
            • import Java.lang.Math
            • and then to calculate eg the root of 5 we write
            • Math.sqrt (5)
*/
class Main {

    public static void main(String[] args) {

        Point point = new Point(); // Define a point

        point.setPoint(1, 3);

        point.print();
        System.out.println("The distance from the beginning of the axes is: " + point.length());

    }
}
