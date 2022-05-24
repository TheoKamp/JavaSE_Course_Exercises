/*
    Exercise 3:
        A philosopher is characterized by:
        • His name (string)
        • His time (string, eg "Ancient Greece")
        • His books (table of strings eg [“The Republic”,“Phaedon”]).
        • His school (string eg "Idealism")

        Construct the philosopher class:
            • the manufacturer simply allocates the necessary space for the table (to have 5 places).
            • Define a print method that prints formatted the elements of the philosopher.

        In the main to build two philosophers
            • Plato (Ancient Greek - [“The Republic”, “Phaedon”], “Platonism”)
            • Baruch Spinoza (Modern Netherlands - [“Ethics”, Political Treatise ”],“ Rationalism ”)
            • and then call the print for the two philosophers.
*/

class Main {

    public static void main(String[] args) {
        Philosopher Plato = new Philosopher("Plato", "Ancient Greece", "Platonism");
        Philosopher Spinoza = new Philosopher("Baruch Spinoza", "Modern Netherlands", "Rationalism");

        Plato.addBook("The Republic");
        Plato.addBook("Phaedon");
        Spinoza.addBook("Ethics");
        Spinoza.addBook("Political Treatise");

        Plato.print();
        Spinoza.print();
    }
}
