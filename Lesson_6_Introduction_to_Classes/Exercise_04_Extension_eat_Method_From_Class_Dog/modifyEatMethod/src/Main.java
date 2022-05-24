/*
    Exercise 4:
        Modify the eat method of the Dog class of exercise 2 so that
        to take as an argument an integer variable (quantity). The mood
        of the dog to increase as much as the quantity argument (with maximum permissible value 10).
*/
class Main {

    public static void main(String[] args) {
        // Declare a dog
        Dog zizel  = new Dog();
        zizel.name = "Zizel";
        zizel.weight = 5.0;
        zizel.breed  = "Maltese";

        zizel.eat(5);
        zizel.bark();


    }
}
