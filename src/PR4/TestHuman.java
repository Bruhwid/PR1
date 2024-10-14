package PR4;

public class TestHuman {
    public static void main(String[] args) {
        Human h_1 = new Human(3, 6, 8);
        Human h_2 = new Human();
        h_2.setHead(1);
        h_2.setHand(1);
        h_2.setLeg(2);

        System.out.println("Head first: " + h_1.getHead());
        System.out.println("Hand first: " + h_1.getHand());
        System.out.println("Leg first: " + h_1.getLeg());


        System.out.println("Head second: " + h_2.getHead());
        System.out.println("Hand second: " + h_2.getHand());
        System.out.println("Leg second: " + h_2.getLeg());
    }
}