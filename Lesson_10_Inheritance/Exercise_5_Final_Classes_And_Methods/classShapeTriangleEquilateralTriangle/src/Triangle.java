class Triangle extends Shape {
    private Point pointA, pointB, pointC;

    Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void moveTo(Point obj) {
        double diffX, diffY;
        diffX = obj.getX() - pointA.getX();
        diffY = obj.getY() - pointA.getY();
        pointA.set(obj.getX(), obj.getY());
        pointB.set(pointB.getX()+diffX, pointB.getY()+diffY);
        pointC.set(pointC.getX()+diffX, pointC.getY()+diffY);
    }

    @Override
    public void draw() {
        pointA.print();
        pointB.print();
        pointC.print();
    }

    public double line(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
    }

    final double perimeter() {
        double l1, l2, l3;
        l1 = line(pointA, pointB);
        l2 = line(pointB, pointC);
        l3 = line(pointC, pointA);
        return l1+l2+l3;
    }
}
