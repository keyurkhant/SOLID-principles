package solid.good.s;

import java.util.List;

public class LibraryManagementSystem {
    private BookManager bookManager;
    private UserManager userManager;

    public LibraryManagementSystem(BookManager bookManager, UserManager userManager) {
        this.bookManager = bookManager;
        this.userManager = userManager;
    }

    public void addBook(Book book) {
        bookManager.addBook(book);
    }

    public void removeBook(Book book) {
        bookManager.removeBook(book);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookManager.searchBooksByTitle(title);
    }

    public List<Book> searchBooksByAuthor(String author) {
        return bookManager.searchBooksByAuthor(author);
    }

    public void registerUser(User user) {
        userManager.registerUser(user);
    }

    public void removeUser(User user) {
        userManager.removeUser(user);
    }

    public List<User> searchUsersByName(String name) {
        return userManager.searchUsersByName(name);
    }

    public List<User> searchUsersByAddress(String address) {
        return userManager.searchUsersByAddress(address);
    }

    public void lendingBook(Book book, User user) {
        bookManager.lendingBook(book, user);
    }

    public void returnBook(Book book, User user) {
        bookManager.returnBook(book, user);
    }

    public List<Book> getAvailableBooks() {
        return bookManager.getAvailableBooks();
    }

    public List<Book> getBorrowedBooks() {
        return bookManager.getBorrowedBooks();
    }
}
