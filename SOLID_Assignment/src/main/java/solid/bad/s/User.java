package solid.bad.s;

import java.util.List;

public class User {
    private String name;
    private String address;
    private List<Book> borrowedBooks;

    public User(String name, String address, List<Book> borrowedBooks) {
        this.name = name;
        this.address = address;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
