package PreparationsForInterview.FirstJavaProject;

public class Book {

    String title;
    final String author;


    public String getAuthor() {
        return this.author;
    }

       public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void printInfo(String title, String author){
        System.out.println("Book title:" + title + ". Book author:" + author);
    }
}
