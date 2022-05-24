class PlaylistTutorial extends Playlist {
    /* TUTORIAL PLAYLIST ATTRIBUTES */
    public String subject; // The tutorial subject

    /* PLAYLIST TUTORIAL CONSTRUCTOR */
    PlaylistTutorial(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    /* OVERRIDES THE recommendation() ALWAYS
       RETURNS THE FIRST VIDEO OF THE PLAYLIST */
    @Override
    public String recommendation() {
        return videos[0];
    }
}
