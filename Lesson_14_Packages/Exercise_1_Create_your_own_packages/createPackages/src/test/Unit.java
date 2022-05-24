package test;
import main.wrappers.*;

public class Unit {
    private Cat cat;
    private Dog dog;

    public Unit() {
        System.out.println("Inside Unit Class");
        cat = new Cat();
        dog = new Dog();
        System.out.println("Test completed successfully");
    }
}
