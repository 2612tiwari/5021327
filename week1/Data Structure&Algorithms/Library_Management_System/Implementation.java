import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem(List<Book> books) {
        this.books = books;
    }

    // Linear search for a book by title
    public Book searchBookByTitleLinear(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}
