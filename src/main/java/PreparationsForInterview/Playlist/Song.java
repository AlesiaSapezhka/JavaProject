package PreparationsForInterview.Playlist;

public class Song {
    private String title;
    private String artist;
    private double duration;

    public Song(String artist, String title, double duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
