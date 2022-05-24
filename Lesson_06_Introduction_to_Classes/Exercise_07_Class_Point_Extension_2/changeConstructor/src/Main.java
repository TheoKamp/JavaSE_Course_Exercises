/*
    Exercise 7:
        • Modify the exercise point class 6 so that it has
          a constructor who initializes the members of the class.
        • Modify the main appropriately to maintain it
          its functionality.
*/
class Main {

    public static void main(String[] args) {

        Point point = new Point(3, 4); // Define a point

        point.print();
        System.out.println("The distance from the beginning of the axes is: " + point.length());

    }
}
