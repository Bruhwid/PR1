package PR4;

public class TestCircle {
    public static void main(String[] args) {
        Circle c_1 = new Circle(13, "Red");
        Circle c_2 = new Circle();
        c_1.setColor("Black");
        c_2.setRadius(166);

        System.out.println("Color: " + c_1.getColor());
        System.out.println("Radius= " + c_2.getRadius());
    }
}