/*
    Exercise 1:
        We define an ontology of the animal kingdom:
            • Animal: It has characteristic weight and height.
            * Horse: Inherits the Animal and expands it with:
                • its color
                • his urine (length)
            • Dog: Inherits the Animal and extends it with:
                • barking volume (in dB)
                • the bark () method that produces a suitable sound
            • Doberman: Inherits the Dog and extends it with:
                • the run () method that produces an appropriate message
            • Bulldog: Inherits the Dog and extends it with:
                * The size of his ears.
                • the sleep () method that produces an appropriate message
        Then name a specific horse, a Doberman and one
        bulldog:
            • Print the color of the horse.
            * Doberman barks, runs and then barks.
            • The Bulldog barks, sleeps and then sleeps again.
*/

class Main {

    public static void main(String[] args) {
        Horse horse = new Horse(300.0, 2.00, "brown", 0.80);
        Doberman doberman = new Doberman(50.0, 1.20, 70.0);
        Bulldog bulldog = new Bulldog(45.0, 0.80, 55.0, 0.30);

        System.out.println("Horse weight: " + horse.getWeight() + " height: " + horse.getHeight() + " tail length: " +
                            horse.getTailLength());
        System.out.println("and Horse colour is " + horse.getColour());
        System.out.println("--------------------------------------------------");

        System.out.println("Doberman weight: " + doberman.getWeight() + " height: " + doberman.getHeight());
        System.out.print("Doberman barks ");
        doberman.bark();
        System.out.print("Doberman ");
        doberman.run();
        System.out.print("Doberman barks ");
        doberman.bark();
        System.out.println("--------------------------------------------------");

        System.out.println("Bulldog weight: " + bulldog.getWeight() + " height: " + bulldog.getHeight());
        System.out.print("Bulldog barks ");
        bulldog.bark();
        System.out.print("Bulldog ");
        bulldog.sleep();
        System.out.print("Bulldog again ");
        bulldog.sleep();
    }
}
