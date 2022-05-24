class Point {

    double x;
    double y;

    /* DEFAULT CONSTRUCTOR */
    Point() {
        x = 0;
        y = 0;
    }

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + "," + y + ")");
    }
}
