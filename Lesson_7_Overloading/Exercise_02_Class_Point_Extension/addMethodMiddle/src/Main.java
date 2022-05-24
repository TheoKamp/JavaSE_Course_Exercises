/*
    Exercise 2:
        Extend the Point class (Example 5) with the middle method which will
        takes another Point object as a parameter and returns the point
        is the medium between the object itself and the point accepted as an argument.
        • In the main make appropriate snapshots and find out the method that
          you built it works properly.
*/

class Main {

    public static void main(String[] args) {
	    Point p1 = new Point(3, 5);
        Point p2 = new Point(2, 4);
        Point middlePoint;
        System.out.print("Point 1: ");
        p1.print();
        System.out.print("Point 2: ");
        p2.print();

        middlePoint = p1.middle(p2);
        System.out.print("Middle Point: ");
        middlePoint.print();

    }
}
