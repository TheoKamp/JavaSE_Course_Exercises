import java.lang.Math;

class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0,0), new Point(1,1),new Point(2,0));

        triangle.draw();

        System.out.println(triangle.perimeter());

        triangle.moveTo(new Point(3.0,5.0));

        System.out.println("-----------------------------------");
        triangle.draw();
        System.out.println(triangle.perimeter());

        EquilateralTriangle eqTriangle = new EquilateralTriangle(new Point(0,0),
                                         new Point(1, Math.sqrt(3)), new Point(2, 0));
        System.out.println(eqTriangle.checkEquilateral());
    }
}
