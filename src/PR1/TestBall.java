package PR1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 2, 3);
        Ball b2 = new Ball("Green", 7, 10);
        Ball b3 = new Ball("Purple", 54, 12);
        System.out.println("Ball 1 radius= " + b1.getRadius());
        System.out.println("Ball 1 mass= " + b1.getMass());
        System.out.println("Ball 1 color= " + b1.getColor());
        System.out.println("Ball 2 radius= " + b2.getRadius());
        System.out.println("Ball 2 mass= " + b2.getMass());
        System.out.println("Ball 2 color= " + b2.getColor());
        System.out.println("Ball 3 radius= " + b3.getRadius());
        System.out.println("Ball 3 mass= " + b3.getMass());
        System.out.println("Ball 3 color= " + b3.getColor());
        
        

    }
}
