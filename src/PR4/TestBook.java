package PR4;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "Joanne Rowling", "13.12.1998", "13.12.2000");
        Book b2 = new Book("Alchemist", "Paulo Coelho", "", "18.09.1885");
        Book b3 = new Book("Cherry garden", "Anton Chekhov", "10.08.1907", "10.08.1908");
        b3.setData("09.03.1890"); 

        b2.setData("26.05.1880");

        System.out.println("Title: " + b2.getName());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Year: " +b2.getData());
        System.out.println("Updated year: " +b2.getUpdate());
    }
}
