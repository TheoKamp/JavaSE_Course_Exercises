public class Animal {
    /* ATTRIBUTES */
    private double weight;
    private double height;

    /* CONSTRUCTOR */
    Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    /* GETTERS AND SETTERS FOR WEIGHT AND HEIGHT */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

}
