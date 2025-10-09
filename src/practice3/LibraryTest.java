package practice3;

public class LibraryTest {
    static void main(String[] args) {

    Library library1 = new Library();
    library1.setAuthor("ivan");
    library1.setYear(1999);
    library1.setCategory("main library");
    // library1.bookTitle // can't use since field is private
    }
}
