import java.util.Random;

class Playlist {
    /* PLAYLIST ATTRIBUTES */
    public String title; // Playlist title
    public String[] videos; // Stores the videos
    private int numOfVideos; // Stores the number of videos in playlist

    /* PLAYLIST CONSTRUCTOR */
    Playlist(String title) {
        this.title = title;
        videos = new String[10];
        numOfVideos = 0;
    }

    /* TITLE SETTER */
    public void setTitle(String title) {
        this.title = title;
    }

    /* addVideo(): ADD A NEW VIDEO IN PLAYLIST */
    public void addVideo(String newVideo) {
        videos[numOfVideos] = newVideo;
        numOfVideos++;
    }

    /* recommendation(): RANDOM CHOICE VIDEO */
    public String recommendation() {
        Random randVideo = new Random(); // Random choice
        return videos[randVideo.nextInt(numOfVideos)];
    }

    /* FORMATTED STRING TO PRINT PLAYLIST DETAILS */
    @Override
    public String toString() {
        String str = "";
        str += "* " + title + " Playlist *\n";
        for (int i = 0; i < numOfVideos; i++)
            str += (i+1) + ") " + videos[i] + "\n";
        return str;
    }
}
