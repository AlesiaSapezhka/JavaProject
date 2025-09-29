package practice3;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle( String bookTitle) {
        return this.bookTitle;
    }

    String getAuthor( String author) {
        return this.author;
    }

    int getYear(String year) {
        return this.year;
    }

    String getCategory(String category) {
        return this.category;
    }

    void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void setCategory(String newCategory) {
        this.category = newCategory;
    }

}
