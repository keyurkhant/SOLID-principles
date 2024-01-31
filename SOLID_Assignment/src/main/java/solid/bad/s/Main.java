package solid.bad.s;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        Book book = new Book("Gravity", "Gaurav S.", BookStatus.AVAILABLE);
        libraryManagementSystem.addBook(book);

        User user = new User("Keyur", "Halifax", new ArrayList<Book>());
        libraryManagementSystem.registerUser(user);

        for(Book book1: libraryManagementSystem.getAvailableBooks()) {
            System.out.println(book1.getTitle() + " by " + book1.getAuthor() + " and it is " + book1.getBookStatus());
        }

        libraryManagementSystem.lendingBook(book, user);

        for(Book book1: libraryManagementSystem.getBorrowedBooks()) {
            System.out.println(book1.getTitle() + " by " + book1.getAuthor() + " and it is " + book1.getBookStatus());
        }

        libraryManagementSystem.removeBook(book);

        System.out.println("Available books: " + libraryManagementSystem.getAvailableBooks().size());
    }
}
