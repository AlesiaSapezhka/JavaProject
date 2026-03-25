package PreparationsForInterview.OOPInJava;

public class LiveSession extends Lessons {
    private String title;
    private int duration;
    LiveSession(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    String getTitle(){
        return title;
    }
    int getDuration(){
        return duration*2;
    }
}
