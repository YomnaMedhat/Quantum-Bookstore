public  class DemoBook extends Book{
    public DemoBook(String ISBN, String title, int year, double price) {
        super(ISBN, title, year, price);
    }

    @Override
    public boolean inStock() {
        return false;
    }

    @Override
    public double purchaseBook(int quantity, String email, String address) {
        System.out.println("------Quantum Book Store------");
        throw new UnsupportedOperationException("Demo books are not for sale");
    }
}