package solid.good.s;

public class Book {
    private String title;
    private String author;
    private BookStatus bookStatus;

    public Book(String title, String author, BookStatus bookStatus) {
        this.title = title;
        this.author = author;
        this.bookStatus = bookStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
