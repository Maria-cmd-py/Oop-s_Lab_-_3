package LibraryManagementSystem;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        library.addBook("1984", "George Orwell", "9780451524935");
        library.addBook("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        library.displayBooks();
        library.searchBook("1984");
        library.removeBook("9780743273565");
        library.displayBooks();
    }
}