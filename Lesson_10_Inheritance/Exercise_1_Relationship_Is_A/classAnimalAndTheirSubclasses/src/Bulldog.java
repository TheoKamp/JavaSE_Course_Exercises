class Bulldog extends Dog {
    /* BULLDOG ATTRIBUTES */
    private double earsLength; // Stores the ears length

    /* BULLDOG CONSTRUCTOR */
    Bulldog(double weight, double height, double intensityDB, double earsLength) {
        super(weight, height, intensityDB);
        this.earsLength = earsLength;
    }

    /* GETTERS AND SETTERS FOR EARS LENGTH */
    public void setEarsLength(double earsLength) {
        this.earsLength = earsLength;
    }

    public double getEarsLength() {
        return earsLength;
    }

    /* sleep(): PRINT A MESSAGE */
    public void sleep() {
        System.out.println("is sleeping...zZzZzzZZZzzZ");
    }
}
