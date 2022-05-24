class Philosopher {
    /** ATTRIBUTES **/
    String name;
    String era;
    String[] books;
    String school;
    int numOfBooks; // Stores the number of the books inside the books array

    /** CONSTRUCTORS **/

    /* CONSTRUCTOR INITIALIZES A Philosophers name, era, and school
       BY PARAMETERS ALSO ALLOCATES MEMORY FOR A 5 STRING ELEMENTS ARRAY */
    Philosopher(String name, String era, String school) {
        this.name = name;
        this.era = era;
        this.school = school;
        books = new String[5];
        numOfBooks = 0;
    }

    /** METHODS **/

    /* ADD A NEW BOOK IN THE BOOK ARRAY */
    void addBook(String newBook) {
        if(numOfBooks == 5)
            System.out.println("The books array is full. Add new book failed.");
        else {
            books[numOfBooks] = newBook;
            numOfBooks++;
        }
    }

    /* PRINT FORMATTED THE CHARACTERISTICS OF PHILOSOPHER */
    void print() {
        System.out.print(name + "(" + era);
        System.out.print("-[");
        for(int i = 0; i < numOfBooks-1; i++)
            System.out.print(books[i] + ", ");
        System.out.println(books[numOfBooks-1] + "], " + school + ")");
    }
}
