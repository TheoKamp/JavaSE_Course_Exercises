import java.util.Locale;
import java.util.Scanner;

class TropicalFruit extends Food {
    private String type;

    public TropicalFruit(){}
    public TropicalFruit(String name, double calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    public double eat() {
        System.out.println("I am eating " + getName() + "(" + type + ")");
        return getCalories();
    }

    @Override
    public Object copy() {
        return new TropicalFruit(getName(), getCalories(), type);
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TropicalFruit that = (TropicalFruit) o;
        return getName().equals(that.getName()) && getCalories() == that.getCalories() && type.equals(that.type);
    }

    @Override
    public void read(Scanner src) {
        src.useLocale(Locale.US);
        src.nextLine();
        System.out.print("Add tropical fruit: ");
        String name = src.nextLine();
        System.out.print("Add fruits calories: ");
        double calories = Utils.readDouble(src);
        this.setName(name);
        this.setCalories(calories);
        src.nextLine();
        System.out.print("Add fruit type: ");
        this.type = src.nextLine();

    }
}
