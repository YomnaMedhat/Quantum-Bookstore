public class EBook extends Book{
    private String filetype;

    public EBook(String ISBN, String title, int year, double price, int stock, String filetype) {
        super(ISBN, title, year, price);
        this.filetype = filetype;
    }

    @Override
    public boolean inStock() {
        return true;
    }

    @Override
    public double purchaseBook(int quantity, String email, String address) {
        if (quantity > 1) {
            System.out.println("------Quantum Book Store------");
            throw new IllegalArgumentException("Only 1 EBook allowed per purchase");
        }
        sendByEmail(email, title + "." + filetype);
        return price;
    }
}