import java.lang.Math;

class Point
{
    double x;
    double y;

    /* DEFAULT CONSTRUCTOR */
    Point() {
        x = 0;
        y = 0;
    }

    /* COPY CONSTRUCTOR */
    Point(Point ob) {
        x = ob.x;
        y = ob.y;
    }

    /* CONSTRUCTOR TAKING PARAMETERS */
    Point(double inX, double inY)
    {
        this.x = inX;
        this.y = inY;
    }

    /* set(): SET VALUES TO x AND y */
    void set(double inX, double inY)
    {
        this.x = inX;
        this.y = inY;
    }

    /* print(): PRINT THE POINT */
    void print()
    {
        System.out.println("(" + this.x + "," + this.y + ")");
    }

    /* length(): RETURNS THE DISTANCE FROM ZERO */
    double length()
    {
        return Math.sqrt((x * x)+(y * y));
    }

    /* middle(): RETURNS THE MIDDLE POINT
                 BETWEEN THIS POINT AND ANOTHER */
    Point middle(Point ob) {
        Point temp = new Point();
        temp.x = (this.x + ob.x) / 2;
        temp.y = (this.y + ob.y) / 2;
        return temp;
    }

}