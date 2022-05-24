/*
    Exercise 1: The archetype of the dog
        A dog is characterized by:
            • His name
            • Its weight
            • Its type

        Build the dog class. Automatically initialize
        its weight in 10 kg and its species in Terrier.

        Then set two instances:
            • Piko (10 kg - Terrier)
            • Lassie (30 kg - Colley)

    CODE BY: THODORIS KAMPOZIS
*/
class Main {

    public static void main(String[] args) {
        // Declare two class Dog objects
        Dog piko = new Dog();
        Dog lassie = new Dog();

        // Piko is by default 10kg and Terrier
        piko.name = "Piko";

        // Initialize Lassie
        lassie.name = "Lassie";
        lassie.weight = 30.0;
        lassie.breed = "Colley";

        // Print two dogs
        System.out.println(piko.name + " " + "(" + piko.weight + "-" + piko.breed + ")");
        System.out.println(lassie.name + " " + "(" + lassie.weight + "-" + lassie.breed + ")");

    }
}
