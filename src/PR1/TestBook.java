package PR1;

public class TestBook {
    public static void main(String[] args) {
        PR1.Book b1 = new PR1.Book("Harry Potter", "Joanne Rowling", 8);
        PR1.Book b2 = new PR1.Book("Alchemist", "Paulo Coelho", 5);
        PR1.Book b3 = new PR1.Book("Cherry garden", "Anton Chekhov", 12);
        b3.setPrice(12);
        System.out.println(b3);
        b1.bookSale();
        b2.bookSale();
        b3.bookSale();
    }
}