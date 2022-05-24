public class Snack extends Food {

    Snack(String name, double calories) {
       super(name, calories);
    }

    @Override
    double eat() {
        System.out.println("I am eating " + getName());
        return getCalories();
    }


}
