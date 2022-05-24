/** Exercise 1:
 *      Construct a project that is organized as follows:
 *          src
 *             main
 *                wrappers
 *                  Cat.java
 *                  Dog.java
 *                main.Main.java
 *             test
 *                Unit.java */

package main;
import main.wrappers.*;
import test.*;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Unit unit = new Unit();
    }
}
