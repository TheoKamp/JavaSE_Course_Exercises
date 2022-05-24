/** Exercise 3: Extend exercise 4 of lesson 12 so that:
        • The Food class to implement a "read" method which will initializes
          an object by reading the values for its members from the keyboard.
        • The TropicalFruit class redefines the "read" method so that
          to read the values for its members from the keyboard. */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Food[] foods = new Food[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < foods.length; i++) {
            System.out.println("ADD NEW FOOD");
            System.out.print("Snack or Tropical Fruit (1 or 2): ");
            int choice = Utils.readInt(input);
            switch (choice) {
                case 1 -> {
                    Snack newSnack = new Snack();
                    newSnack.read(input);
                    foods[i] = newSnack;
                }
                case 2 -> {
                    TropicalFruit newFruit = new TropicalFruit();
                    newFruit.read(input);
                    foods[i] = newFruit;
                }
            }
            System.out.println("------------------");
        }

        System.out.println("FOODS");
        System.out.println(Arrays.toString(foods));

        input.close();


    }
}
