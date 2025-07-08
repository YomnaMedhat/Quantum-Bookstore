/* IMPORTANT NOTE: I added a new product type (AudioBook) to show how the system can be easily
   extensible, so that we don’t need to modify it if we’ve added a new type of products */

class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BooksInventory inventory = new BooksInventory();

        System.out.println("===============================  ADDING BOOKS  ==========================================");
        inventory.addBook(new PaperBook("P111", "Java Fundamentals", 2015, 50.0, 5));
        inventory.addBook(new EBook("E222", "Python Fundamentals", 2021, 25.0, 10, "pdf"));
        inventory.addBook(new DemoBook("D333", "C++", 2010, 0.0));
        inventory.addBook(new AudioBook("A444", "Java", 2023, 30.0, "mp3"));

        System.out.println("===============================  BUYING BOOKS  ==========================================");
        inventory.buy("P111", 1, "user@example.com", "Gamal Abdel Nasser Street");
        inventory.buy("E222", 1, "reader@example.com", null);

        try {
            inventory.buy("D333", 1, "nobody@example.com", "here");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===============================  REMOVING BOOKS  ========================================");

        inventory.removeOutdated(2025, 10);
    }
}