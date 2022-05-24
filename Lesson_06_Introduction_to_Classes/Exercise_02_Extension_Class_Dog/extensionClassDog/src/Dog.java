/* classDog() */
public class Dog {
    String name;
    double weight;
    String breed;
    int mood;

    /* CONSTRUCTOR INITIALIZES
       weight, breed AND mood */
    Dog() {
        weight = 10;
        breed = "Terrier";
        mood = 5;
    }

    /** METHODS **/

    /* eat(): INCREASES mood BY 1 */
    void eat() {
        if(mood < 10)
            mood++;
    }
    /* bark(): PRINTS A MESSAGE DEPENDS ON THE MOOD */
    void bark() {
        if(mood > 5)
            System.out.println("Woof Woof Woof");
        else
            System.out.println("Woof");
    }
    /* walk(): INCREASES mood BY 1 */
    void walk() {
        if(mood < 10)
            mood++;
    }
}
