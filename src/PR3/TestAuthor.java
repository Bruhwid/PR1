package PR3;

public class TestAuthor{
    public static void main(String[] args) {
        Author a_1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author a_2 = new Author("Tatyana Kryachek", "ilhakovan@yandex.ru", 'M');
        a_2.setEmail("ilyams04@gmail.com");
        System.out.println(a_1);
        System.out.println(a_2);
    }
}