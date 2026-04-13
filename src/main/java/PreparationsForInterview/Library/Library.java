package PreparationsForInterview.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void lendBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.lend();
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBack();
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}