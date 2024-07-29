import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem(List<Book> books) {
        // Ensure the list is sorted by title for binary search
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        this.books = books;
    }

    // Binary search for a book by title
    public Book searchBookByTitleBinary(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            
            int comparison = midBook.getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }
}
