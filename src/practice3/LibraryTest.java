package practice3;

public class LibraryTest {
    public static void main(String[] args) {

    Library library1 = new Library();
    library1.author = "ivan";
    library1.year = 1999;
    library1.category = "main library";
    // library1.bookTitle // can't use since field is private
    }
}
