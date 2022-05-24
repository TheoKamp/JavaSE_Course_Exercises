/*
    Exercise 2:
        The Food class contains:
            • name: Name (string)
            • calories: Calories (real)
            • double eat (): Abstract method
        The Snack class
            • Redefines eat to print “I am eating snack XX”
              where XX is the name of the snack and returns the calories
              consumed
        The TropicalFruit class contains
            • type: Fruit type (string, eg Drupe, Berry)
            • Redefines eat to print “I am eating XX (YY)”
              where XX the name of the fruit and YY its species.
              To returns its calories.

        In main make a table of 5 fruits or snacks.
        Then eat them and calculate their total number
        calories.
*/
class Main {

    public static void main(String[] args) {
        Food[] foods = new Food[5];

        foods[0] = new Snack("Toast", 200.0);
        foods[1] = new TropicalFruit("Mango", 60.0, "Drupe");
        foods[2] = new Snack("Nutrition Bar", 125.0);
        foods[3] = new Snack("Oat meal", 360.0);
        foods[4] = new TropicalFruit("Avocando", 160.0, "Berry");

        double totalCalories = 0;
        for (var food: foods)
            totalCalories += food.eat();
        System.out.println("Total Calories: " + totalCalories);
    }
}
