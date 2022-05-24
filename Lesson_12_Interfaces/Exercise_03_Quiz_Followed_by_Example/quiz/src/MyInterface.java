public interface MyInterface {

    // int interfaceVar; // Variable can't exist
    final int interfaceFinVar = 0; // Final can exist
    // static int interfaceStatVar; // Static Variable can't exist
    static final int interfaceStatFinVar = 1; // Static Final Variable can exist
    public void interfaceMethod(); // Method can exist
    public static void interfaceStatMethod(){ // Static Method can exist
        System.out.println("Interface Static Method");
    }
    abstract void abstractInterfaceMethod(); // Abstract Method can exist
}
