class AudioBook extends Book {
    private String audiotype;

    public AudioBook(String ISBN, String title, int year, double price, String audiotype) {
        super(ISBN, title, year, price);
        this.audiotype = audiotype;
    }

    @Override
    public boolean inStock() {
        return true;
    }

    @Override
    public double purchaseBook(int quantity, String email, String address) {
        if (quantity > 1) {
            System.out.println("------Quantum Book Store------");
            throw new IllegalArgumentException("Only 1 AudioBook per purchase allowed");
        }
        sendByEmail(email, title + "." + audiotype);
        return price;
    }
}