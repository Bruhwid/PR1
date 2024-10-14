package PR1;
public class TestDog {
    public static void main(String[] args) {
            PR1.Dog d1 = new PR1.Dog("Mike", 2);
            PR1.Dog d2 = new PR1.Dog("Helen", 7);
            PR1.Dog d3 = new PR1.Dog("Bob");
            d3.setAge(1);
            System.out.println(d1);
            d1.intoHumanAge();
            d2.intoHumanAge();
            d3.intoHumanAge();
    }
}