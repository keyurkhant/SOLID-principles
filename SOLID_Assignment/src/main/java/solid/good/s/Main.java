package solid.good.s;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem(bookManager, userManager);

        Book book1 = new Book("Gravity", "Gaurav S.", BookStatus.AVAILABLE);
        Book book2 = new Book("Gravity - the external force", "Gaurav S.", BookStatus.AVAILABLE);
        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);

        User user1 = new User("Vaidik Nimavat", "Halifax", new ArrayList<>());
        libraryManagementSystem.registerUser(user1);

        System.out.println("Available Books count: " + libraryManagementSystem.getAvailableBooks().size());
        System.out.println("Borrowed Books count: " + libraryManagementSystem.getBorrowedBooks().size());

        libraryManagementSystem.lendingBook(book1, user1);

        System.out.println("Available Books count: " + libraryManagementSystem.getAvailableBooks().size());
        System.out.println("Lent Book by " + user1.getName() + " is " + user1.getBorrowedBooks().get(0).getTitle());
        System.out.println("Book availability of 'Gravity': " + libraryManagementSystem.searchBooksByTitle("Gravity").get(0).getBookStatus());
    }
}
