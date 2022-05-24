/**
 * Exercise 2:
 *  Further define (extending exercise 1) the interface
 *  DoubleAdjustments which contains the methods:
 *      • void doubleEverything ()
 *      • void halfEverything ()
 *  Then the classes of exercise 1, to implement this as well
 *  interface (to affect the number of calories: In the first to
 *  doubled and in the second to be reduced by half). */

public class Main {

    public static void main(String[] args) {

        // 1. DECLARATION AND INITIALIZATION AN ARRAY OF FOODS(SNACKS/TROPICAL FRUITS)
        Food[] foods1 = new Food[3];
        foods1[0] = new Snack("Toast", 200.0);
        foods1[1] = new TropicalFruit("Avocado", 80.0, "Citrus");
        foods1[2] = new Snack("Cereal Bar", 115.0);
        // 1.1 PRINTS THE ARRAY (foods1)
        System.out.println("--------------------");
        System.out.println("ORIGINAL FOODS ARRAY");
        System.out.println("--------------------");
        for (Food food: foods1)
           food.print();

        // 2. COPY ARRAY foods1 TO A NEW ARRAY foods2
        Food[] foods2 = new Food[foods1.length];
        for (int i = 0; i < foods1.length; i++)
            foods2[i] = (Food) foods1[i].copy();
        // 2.1 PRINTS THE COPIED ARRAY
        System.out.println("--------------------------");
        System.out.println("COPY OF THE ARRAY (foods1)");
        System.out.println("--------------------------");
        for (Food food: foods2)
            food.print();

        // 3. AN ARRAY OF StandardMethods INTERFACE REFERENCES TO ARRAY (foods1)
        StandardMethods[] interfaceOfFoodArr = foods1;
        // 3.1 PRINTS THE ARRAY VIA INTERFACE METHOD
        System.out.println("---------------------------------------------------");
        System.out.println("PRINT OF THE ARRAY (foods1) VIA INTERFACE REFERENCE");
        System.out.println("---------------------------------------------------");
        for (StandardMethods method: interfaceOfFoodArr)
            method.print();

        // 4. ARRAY (foods2) INCREASING CALORIES OF DIFFERENT FOOD KIND
        System.out.println("----------------------------------------------------");
        System.out.println("PRINT OF THE ARRAY (foods2) WITH NEW CALORIES VALUES");
        System.out.println("----------------------------------------------------");
        for (Food food: foods2) {
            food.doubleEverything();
            food.print();
        }

        // 5. ARRAY (foods1) DECREASING CALORIES OF DIFFERENT FOOD KIND
        System.out.println("----------------------------------------------------");
        System.out.println("PRINT OF THE ARRAY (foods1) WITH NEW CALORIES VALUES");
        System.out.println("----------------------------------------------------");
        for (Food food: foods1) {
            food.halfEverything();
            food.print();
        }

    }
}
