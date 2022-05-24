/*
    Exercise 2:
        Extend the dog class of Exercise 1 with the following:
            • The mood member (integer between 5 and 10). To be initialized in 5.
            • The eat method (increases mood by 1)
            • The bark method:
            • If the mood is over 5, print “Woof Woof Woof ”
            • Otherwise print only "Woof"
            • The walk method:
            • Increases mood by 1

        Then implement the script:
            • Define a dog
            • The dog is barking
            • Goes for a walk
            • It barks
            • Goes for a walk
            • It barks
            • Eats
            • It barks

    CODE BY: THODORIS KAMPOZIS
*/
class Main {

    public static void main(String[] args) {
        // Declare a dog
        Dog zizel  = new Dog();
        zizel.name = "Zizel";
        zizel.weight = 5.0;
        zizel.breed  = "Maltese";
        // Dog barks
        System.out.println(zizel.name + " barks");
        zizel.bark();
        // Goes for a walk
        System.out.println(zizel.name + " goes for a walk");
        zizel.walk();
        // Barks
        System.out.println(zizel.name + " barks");
        zizel.bark();
        // Goes for a walk
        System.out.println(zizel.name + " goes for a walk");
        zizel.walk();
        // Barks
        System.out.println(zizel.name + " barks");
        zizel.bark();
        // Eat
        System.out.println(zizel.name + " eating");
        zizel.eat();
        // Barks
        System.out.println(zizel.name + " barks");
        zizel.bark();


    }
}
