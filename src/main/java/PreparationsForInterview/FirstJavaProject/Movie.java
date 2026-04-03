package PreparationsForInterview.FirstJavaProject;

public class Movie {
    String name;
    int year;

    public Movie (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }
    public static void description (String name, int year){
        System.out.println("Movie " + name  + "published in " + year + "year");
    }
}
