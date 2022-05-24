class EquilateralTriangle extends Triangle {

    EquilateralTriangle(Point pointA, Point pointB, Point pointC) {
        super(pointA, pointB, pointC);
    }

    public boolean checkEquilateral(){
        double l1, l2, l3;
        l1 = line(getPointA(), getPointB());
        l2 = line(getPointB(), getPointC());
        l3 = line(getPointA(), getPointC());

        return Math.abs(l1-l2) < 0.0001 && Math.abs(l2-l3) < 0.0001 && Math.abs(l1-l3) < 0.0001;
    }
}
