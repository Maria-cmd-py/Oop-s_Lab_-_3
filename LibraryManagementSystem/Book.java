package LibraryManagementSystem;
import java.util.ArrayList;
class Book {
    String title;
    String author;
    String ISBN;
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}
