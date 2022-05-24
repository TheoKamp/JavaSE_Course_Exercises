/*
    Exercise 4:
        Modify exercise 2 of lesson 10, using
        the toString () instead of the print () we used.
*/
class Main {

    public static void main(String[] args) {

        /* SET A NEW PLAYLIST PRINT THE CONTENT AND RETURN A RECOMMENDED VIDEO */
        Playlist greekMythology = new Playlist("Ancient Greek Mythology");
        greekMythology.addVideo("Zeus");
        greekMythology.addVideo("Hera");
        greekMythology.addVideo("Hercules");
        greekMythology.addVideo("Athena-Apollo");
        greekMythology.addVideo("Demeter-Aphrodite");
        System.out.println(greekMythology.toString());
        System.out.println("Recommended video: " + greekMythology.recommendation());
        System.out.println("---------------------------------------------------------");
        System.out.println();

        /* SET A NEW TUTORIAL PLAYLIST PRINT THE CONTENT AND RETURN A RECOMMENDED VIDEO */
        PlaylistTutorial javaTutorial = new PlaylistTutorial("Java Tutorial", "Programming");
        javaTutorial.addVideo("Lesson 1 - Introduction To Java");
        javaTutorial.addVideo("Lesson 2 - Variables and Data Types");
        javaTutorial.addVideo("Lesson 3 - Operators and Control Structures");
        System.out.println(javaTutorial.toString());
        System.out.println("Recommended video: " + javaTutorial.recommendation());
        System.out.println("---------------------------------------------------------");
    }
}
