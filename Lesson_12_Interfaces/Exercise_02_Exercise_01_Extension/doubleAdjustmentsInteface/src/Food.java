abstract class Food implements StandardMethods, DoubleAdjustments {
    private String name;
    private double calories;

    public Food(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    abstract double eat();

    @Override
    public String toString() {
        return name + " " + calories + " kcal\n";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public void doubleEverything() {
        calories *= 2;
    }

    @Override
    public void halfEverything() {
        calories /= 2;
    }
}
