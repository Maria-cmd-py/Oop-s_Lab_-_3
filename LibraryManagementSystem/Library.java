package LibraryManagementSystem;
import java.util.ArrayList;
class Library {
    ArrayList<Book> books;
    Library() {
        books = new ArrayList<>();
    }
    void addBook(String title, String author, String ISBN) {
        books.add(new Book(title, author, ISBN));
        System.out.println("Book added: " + title);
    }
    void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                books.remove(book);
                System.out.println("Book removed: " + book.title);
                return; } }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
    void searchBook(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                System.out.println("Book found: " + book);
                return; } }
        System.out.println("Book with title " + title + " not found."); }
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            } } } }
