public class PaperBook extends Book{
    private int stock;

    public PaperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year, price);
        this.stock = stock;
    }

    @Override
    public boolean inStock() {
        return stock > 0;
    }

    @Override
    public double purchaseBook(int quantity, String email, String address) {
        if (quantity > stock) {
            System.out.println("------Quantum Book Store------");
            throw new IllegalArgumentException("No enough stock for the book with title " + title);
        }
        stock -= quantity;
        sendByShipping(address, title, quantity);
        return quantity * price;
    }
}