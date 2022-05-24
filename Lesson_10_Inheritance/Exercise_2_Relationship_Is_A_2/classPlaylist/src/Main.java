/*
    Exercise 2:
        We build a program that monitors playlists with
        video:
            • A playlist on YouTube consists of its title
              (string) and the videos it consists of
              (table with a maximum of 10 strings)
            • Both of these class members are public

            For the playlist to have public methods:
                • To add a new video to the playlist
                • recommendation () returns a random video
                • print () to print its contents.
            Next Playlist to be inherited from PlaylistTutorial:
                • The public member "subject" is added to which
                  the theme of the playlist is represented (eg "programming")
                • Resets the recommendation to return the 1st playlist videos.

        In the main program make a Playlist (with 5 videos),
        a PlaylistTutorial (with 3 videos), print their contents,
        and make recommendations (one from each playlist)
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
        greekMythology.print();
        System.out.println("Recommended video: " + greekMythology.recommendation());
        System.out.println("---------------------------------------------------------");
        System.out.println();

        /* SET A NEW TUTORIAL PLAYLIST PRINT THE CONTENT AND RETURN A RECOMMENDED VIDEO */
        PlaylistTutorial javaTutorial = new PlaylistTutorial("Java Tutorial", "Programming");
        javaTutorial.addVideo("Lesson 1 - Introduction To Java");
        javaTutorial.addVideo("Lesson 2 - Variables and Data Types");
        javaTutorial.addVideo("Lesson 3 - Operators and Control Structures");
        javaTutorial.print();
        System.out.println("Recommended video: " + javaTutorial.recommendation());
        System.out.println("---------------------------------------------------------");
    }
}
