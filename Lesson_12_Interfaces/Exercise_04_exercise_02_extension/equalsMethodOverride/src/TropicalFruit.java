import java.util.Objects;

class TropicalFruit extends Food {
    private String type;

    TropicalFruit(String name, double calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    double eat() {
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

}
