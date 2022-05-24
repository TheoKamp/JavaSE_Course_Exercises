class Dog extends Animal {
    /* DOG ATTRIBUTES */
    private double intensityDB; // Voice intensity in decibel

    /* DOG CONSTRUCTOR */
    Dog(double weight, double height, double intensityDB) {
        super(weight, height);
        this.intensityDB = intensityDB;
    }

    /* GETTERS AND SETTERS FOR VOICE INTENSITY */
    public void setIntensityDB(double intensityDB) {
        this.intensityDB = intensityDB;
    }

    public double getIntensityDB() {
        return intensityDB;
    }

    /* bark(): PRINTS A MESSAGE */
    public void bark() {
        System.out.println("Woof Woof");
    }
}
