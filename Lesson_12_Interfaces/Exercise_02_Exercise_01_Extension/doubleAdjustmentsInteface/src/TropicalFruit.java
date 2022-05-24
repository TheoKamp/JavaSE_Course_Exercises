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

}
