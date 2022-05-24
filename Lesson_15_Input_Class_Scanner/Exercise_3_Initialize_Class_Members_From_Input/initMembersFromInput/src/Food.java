import java.util.Locale;
import java.util.Scanner;

abstract class Food implements StandardMethods, DoubleAdjustments {
    private String name;
    private double calories;

    public Food(){}
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
        return name + " " + calories + " kcal";
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

    public void read(Scanner src) {
        src.useLocale(Locale.US);
        src.nextLine();
        System.out.print("Add food: ");
        this.name = src.nextLine();
        System.out.print("Add calories: ");
        this.calories = Utils.readDouble(src);
    }
}
