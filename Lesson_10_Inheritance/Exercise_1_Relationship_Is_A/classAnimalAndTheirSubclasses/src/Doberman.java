class Doberman extends Dog {

    /* DOBERMAN CONSTRUCTOR CALLS DOG CONSTRUCTOR ONLY */
    Doberman(double weight, double height, double intensityDB) {
        super(weight, height, intensityDB);
    }

    /* run(): PRINTS A MESSAGE */
    public void run() {
        System.out.println("is running...");
    }
}
