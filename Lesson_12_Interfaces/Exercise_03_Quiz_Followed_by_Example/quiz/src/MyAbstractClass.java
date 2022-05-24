public abstract class MyAbstractClass implements MyInterface {

    int intVar; // Variable can exist
    final int finVar = 0; // Final Variable can exist
    static double statDoubleVar; // Static Variable can exist
    static final int statFinVar = 1; // Static Final Variable can exist
    public void method() { // Method can exist
        System.out.println("Abstract Super Class Method");
    }
    public static void statMethod() { // Static method can exist
        System.out.println("Abstract Super Class Static Method");
    }
    public abstract void abstractMethod(); // Abstract method can exist
}
