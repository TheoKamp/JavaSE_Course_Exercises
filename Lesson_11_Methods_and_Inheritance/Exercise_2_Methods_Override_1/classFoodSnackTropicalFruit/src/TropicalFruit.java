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
}
