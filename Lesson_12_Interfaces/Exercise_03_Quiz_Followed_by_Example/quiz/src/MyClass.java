public class MyClass extends MyAbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("Derived Class Override Abstract Method from Super Class");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("Derived Class Override Interface Method");
    }

    @Override
    public void abstractInterfaceMethod() {
        System.out.println("Derived Class Override Abstract Interface Method");
    }
}
