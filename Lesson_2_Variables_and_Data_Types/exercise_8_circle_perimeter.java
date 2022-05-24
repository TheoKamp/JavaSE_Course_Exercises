/*************************************************************************
     Exercise 8: Calculate the perimeter of a circle
         Build a program in which the perimeter is calculated
        of the cycle (from the formula 2πR)
            • π is defined as a constant with a value of 3.14.
            • The radius should be double.
            • The final print should be e.g.
                Circle Perimeter(radius: 0.3) = 1.884
 *************************************************************************/
public class exercise_8_circle_perimeter {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius = 0.3;
        System.out.println("Circle Perimeter(radius: " + radius + ") = " + (2 * PI * radius));
    }
}
