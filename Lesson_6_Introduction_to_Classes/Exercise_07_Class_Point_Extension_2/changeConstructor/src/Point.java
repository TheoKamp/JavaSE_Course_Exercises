import java.lang.Math;

class Point {

    double x;
    double y;

    /* DEFAULT CONSTRUCTOR */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    double length() {
        return Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
    }
}
