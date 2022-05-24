public class Person {

    private String fullName;
    private double salary;

    public Person(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return fullName + " " + salary;
    }
}
