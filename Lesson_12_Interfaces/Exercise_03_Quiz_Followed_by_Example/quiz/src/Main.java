/**
 * Exercise 3:
 *      Fill in the table below for which
 *      programming elements can exist in one
 *      abstract class and in an interface respectively:
 *      -----------------------------------------------
 *      Element          Abstract Class      Interface
 *      -----------------------------------------------
 *      Variable:            TRUE              FALSE
 *      Stable:              TRUE              TRUE
 *      Static Variable:     TRUE              FALSE
 *      Static Stable:       TRUE              TRUE
 *      Method:              TRUE              TRUE
 *      Static Method:       TRUE              TRUE
 *      Abstract Method:     TRUE              TRUE
 *
 *      Accompany your answer with a program that
 *      highlights that the elements that can be implemented,
 *      are identical to those of your answer. */

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        System.out.println("-".repeat(69));
        myClass.intVar = 1;
        System.out.println("Super Class intVar initialized and print from Derived Class: " + myClass.intVar);
        System.out.println("-".repeat(69));

        // myClass.interfaceVar = 1; // Not work

        System.out.println("Super Class finVar print through Derived Class: " + myClass.finVar);
        System.out.println("-".repeat(69));

        System.out.println("Interface final variable print through Derived Class: " + myClass.interfaceFinVar);
        System.out.println("-".repeat(69));

        MyAbstractClass.statDoubleVar = 2.3;
        System.out.println("Super Class static variable initialized and print: " + MyAbstractClass.statDoubleVar);
        System.out.println("-".repeat(69));

        // MyInterface.interfaceStatVar = 0; // Not work

        System.out.println("Super Class static final var print: " + MyAbstractClass.statFinVar);
        System.out.println("-".repeat(69));

        System.out.println("Interface static final var print: " + MyInterface.interfaceStatFinVar);
        System.out.println("-".repeat(69));

        System.out.print("Super Class Method through Derived Class: ");
        myClass.method();
        System.out.println("-".repeat(69));

        myClass.interfaceMethod();
        System.out.println("-".repeat(69));

        MyAbstractClass.statMethod();
        System.out.println("-".repeat(69));

        MyInterface.interfaceStatMethod();
        System.out.println("-".repeat(69));

        myClass.abstractMethod();
        System.out.println("-".repeat(69));

        myClass.abstractInterfaceMethod();
        System.out.println("-".repeat(69));

    }
}
