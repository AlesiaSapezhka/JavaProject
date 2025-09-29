package practice2;

public class Book {
    private String title;
    private final String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.author;
    }

    void setTitle( String newTitle){
        this.title = newTitle;
    }

    void setTAuthor( String newAuthor){
        this.title = newAuthor;
    }

    void printInfo(){
        System.out.println("Book title: " + this.title + ", Author: " + this.author);
    }
}
