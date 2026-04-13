package PreparationsForInterview.Library;

public class Book {

    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void lend() {
        if (isAvailable()) {
            availableCopies--;
        } else {
            System.out.println("Нет доступных экземпляров");
        }
    }

    public void returnBack() {
        availableCopies++;
    }
}
