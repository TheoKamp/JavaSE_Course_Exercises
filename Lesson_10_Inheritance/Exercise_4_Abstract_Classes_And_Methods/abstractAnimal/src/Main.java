/*
    Exercise 4:
    We define the following hierarchy of classes:
        • The animal (Animal) has the abstract makeSound method (without parameters)
        • The cat (Cat), inherits the animal, and redefines the method makeSound that prints "Meow"
        • Himalayan cat (HimalayanCat), inherits the cat,redefines the makeSound method that prints “Miouw Miouw ”
        • The dog inherits the animal and redefines the method makeSound that prints "Woof Woof"
        • The Doberman who inherits the dog and does not reappoint the makeSound method
        * The KingDoberman that Doberman inherits and redefines the makeSound method it prints “WOOAAAAAAAAF”

    Then define an object from each class and print it
    sound that it does (also find that it can not be set
    object of the abstract class).
*/
class Main {

    public static void main(String[] args) {
        // Animal animal = new Animal(); // not work error!

        Cat simpleCat = new Cat();
        System.out.print("Cat Says: ");
        simpleCat.makeSound();

        HimalayanCat himalayanCat = new HimalayanCat();
        System.out.print("Himalayan Cat Says: ");
        himalayanCat.makeSound();

        Doberman simpleDoberman = new Doberman();
        System.out.print("Doberman says: ");
        simpleDoberman.makeSound();

        KingDoberman kingDoberman = new KingDoberman();
        System.out.print("King Doberman says: ");
        kingDoberman.makeSound();
    }
}
