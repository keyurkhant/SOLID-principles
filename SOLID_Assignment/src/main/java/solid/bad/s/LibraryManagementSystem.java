package solid.bad.s;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    private List<Book> bookList;
    private List<User> userList;

    public LibraryManagementSystem() {
        bookList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    // Book related operations
    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public List<Book> searchBooksByTitle(String title) {
        return bookList.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooksByAuthor(String author) {
        return bookList.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public void registerUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public List<User> searchUsersByName(String name) {
        return userList.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<User> searchUsersByAddress(String address) {
        return userList.stream()
                .filter(user -> user.getAddress().equalsIgnoreCase(address))
                .collect(Collectors.toList());
    }

    public void lendingBook(Book book, User user) {
        if (book.getBookStatus() == BookStatus.AVAILABLE) {
            book.setBookStatus(BookStatus.BORROWED);
            List<Book> books = user.getBorrowedBooks();
            books.add(book);
            user.setBorrowedBooks(books);
            System.out.println("Book '" + book.getTitle() + "' has been successfully borrowed by " + user.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available for borrowing at the moment.");
        }
    }

    public void returnBook(Book book, User user) {
        if (book.getBookStatus() == BookStatus.BORROWED && hasBorrowedBook(user, book)) {
            book.setBookStatus(BookStatus.AVAILABLE);
            removeBorrowedBook(user, book);
            System.out.println("Book '" + book.getTitle() + "' has been successfully returned by " + user.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' cannot be returned by " + user.getName() +
                    " as it is not borrowed by them.");
        }
    }

    public List<Book> getAvailableBooks() {
        return bookList.stream()
                .filter(book -> book.getBookStatus() == BookStatus.AVAILABLE)
                .collect(Collectors.toList());
    }

    public List<Book> getBorrowedBooks() {
        return bookList.stream()
                .filter(book -> book.getBookStatus() == BookStatus.BORROWED)
                .collect(Collectors.toList());
    }

    public boolean hasBorrowedBook(User user, Book book) {
        List<Book> userBorrowedBooks = user.getBorrowedBooks();
        for(Book book1: userBorrowedBooks) {
            if(book1.getTitle().equals((book.getTitle()))) {
                return true;
            }
        }
        return false;
    }

    public void removeBorrowedBook(User user, Book book) {
        int idx = user.getBorrowedBooks().indexOf(book);
        List<Book> updated = (List<Book>) user.getBorrowedBooks().remove(idx);
        user.setBorrowedBooks(updated);
    }
}

