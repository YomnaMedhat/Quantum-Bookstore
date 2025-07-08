import java.util.ArrayList;
import java.util.List;

public class BooksInventory {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("------Quantum Book Store------");
        System.out.println("Book added - " + book.getTitle());
        System.out.println();
    }

    public Book removeByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    public List<Book> removeOutdated(int currentYear, int outdatedLimit) {
        List<Book> removed = new ArrayList<>();
        for (int i = books.size() - 1; i >= 0; i--) {
            Book book = books.get(i);

            if (currentYear - book.getYear() > outdatedLimit) {
                removed.add(book);
                books.remove(i);

                System.out.println();
                System.out.println("------Quantum Book Store------");
                System.out.println("Removed outdated book - " + book.getTitle());
                System.out.println();
            }
        }
        return removed;
    }

    public double buy(String ISBN, int quantity, String email, String address) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                if (!book.inStock()) {
                    System.out.println("------Quantum Book Store------");
                    throw new UnsupportedOperationException("This book is not for sale");
                }

                double totalPaid = book.purchaseBook(quantity, email, address);

                System.out.println();
                System.out.println("------Quantum Book Store------");
                System.out.println("Purchase completed. Paid: $" + totalPaid);
                System.out.println();

                return totalPaid;
            }
        }

        System.out.println("------Quantum Book Store------");
        throw new IllegalArgumentException("Book with ISBN " + ISBN + " not found");
    }
}