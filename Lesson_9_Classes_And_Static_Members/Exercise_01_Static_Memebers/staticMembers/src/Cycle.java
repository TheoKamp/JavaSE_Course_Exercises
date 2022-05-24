class Cycle {
    /* ATTRIBUTES */
    static final double PI = 3.1415;
    private double c;
    private String metric;

    /* CONSTRUCTOR */
    Cycle(double c, String metric) {
        this.c = c;
        this.metric = metric;
    }

    /* GETTER AND SETTER FOR c */
    public void setC(double c) {
        this.c = c;
    }
    public double getC() {
        return c;
    }

    /* inToCm(): STATIC METHOD CONVERTS INCHES TO CM */
    static public double inToCm(double in) {
        return in * 2.54;
    }

    /* cmToIn(): STATIC METHOD CONVERTS CM TO INCHES */
    static public double cmToIn(double cm) {
        return cm / 2.54;
    }

    /* perimeterCm(): RETURNS THE PERIMETER OF THE CYCLE IN CM */
    public double perimeterCm() {
        if (metric.equals("in"))
            return 2 * PI * inToCm(c) ;
        else
            return 2 * PI * c;
    }

    /* perimeter(): RETURNS THE PERIMETER OF THE CYCLE IN INCHES */
    public double perimeterIn() {
        if (metric.equals("cm"))
            return 2 * PI * cmToIn(c);
        else
            return 2 * PI * c;
    }
}
