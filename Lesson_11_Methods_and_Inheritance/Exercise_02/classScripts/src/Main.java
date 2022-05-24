/*
    Exercise 3:
        We extend the project we had constructed in lesson 10, exercise 4.
        Build a class called Scripts:
            • Contains the makeDoubleSound method: Takes as an argument one
              animal and prints twice the sound it makes.

        Then build a program that uses the
        method we just defined (experiment and check that
        works well for different animals).
*/
class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new HimalayanCat(), new Doberman(), new KingDoberman()};

        for (var animal: animals)
            Scripts.makeDoubleSound(animal);
    }
}
