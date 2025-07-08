abstract class Book {
    protected String ISBN;
    protected String title;
    protected int year;
    protected double price;

    Book(String ISBN, String title, int year, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getISBN() {return ISBN;}
    public String getTitle() {return title;}
    public int getYear() {return year;}
    public double getPrice() {return price;}

    abstract boolean inStock();
    public abstract double purchaseBook(int quantity, String email, String address);

    protected void sendByShipping(String address, String title, int quantity) {
        System.out.println("------Quantum Book Store------");
        System.out.println("Shipping " + quantity + " copy of " + title + " to " + address);
    }

    protected void sendByEmail(String email, String fileName) {
        System.out.println("------Quantum Book Store------");
        System.out.println("Sending EBook " + fileName + " to " + email);
    }
}