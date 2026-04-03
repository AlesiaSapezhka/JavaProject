package PreparationsForInterview.OOPInJava;

public class VideoLesson extends Lessons{
    private String title;
    private int duration;
    VideoLesson(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    String getTitle(){
        return title;
    }
    int getDuration(){
        return duration;
    }
}
