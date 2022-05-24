class Horse extends Animal{
    /* HORSE ATTRIBUTES */
    private String colour; // Stores the colour of the horse
    private double tailLength; // Stores the length of the horse tail

    /* HORSE CONSTRUCTOR */
    Horse(double weight, double height, String colour, double tailLength) {
        super(weight, height);
        this.colour = colour;
        this.tailLength = tailLength;
    }

    /* GETTERS AND SETTERS FOR COLOUR AND TAIL LENGTH */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}
