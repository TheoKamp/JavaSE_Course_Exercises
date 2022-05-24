/**
 * Exercise 1:
 *  Extend the project of exercise 2 of lesson 11 so that
 *  implement the StandardMethods interface of Example 2. */

public class Main {

    public static void main(String[] args) {

        // 1. DECLARATION AND INITIALIZATION AN ARRAY OF FOODS(SNACKS/TROPICAL FRUITS)
        Food[] foods1 = new Food[3];
        foods1[0] = new Snack("Toast", 200.0);
        foods1[1] = new TropicalFruit("Avocado", 80.0, "Citrus");
        foods1[2] = new Snack("Cereal Bar", 115.0);
        // 1.1 PRINTS THE ARRAY (foods1)
        System.out.println("--------------");
        System.out.println("ORIGINAL FOODS");
        System.out.println("--------------");
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

    }
}
